package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.OperationlogMapper;
import com.dyhc.sdglgroundconnection.mapper.RoleMapper;
import com.dyhc.sdglgroundconnection.mapper.StaffMapper;
import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.dyhc.sdglgroundconnection.pojo.OperationlogExample;
import com.dyhc.sdglgroundconnection.pojo.Role;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.OperationlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志业务实现
 **/
@Service
public class OperationlogServiceImpl implements OperationlogService {

    @Autowired
    private OperationlogMapper operationlogMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private StaffMapper staffMapper;

    /**
     * 为每一个操作添加日志（wuyongfei）
     *
     * @param operationlog 日志对象
     * @return 受影响行数
     * @throws Exception 全局异常
     */
    @Override
    public Integer addOperationLog(Operationlog operationlog) throws Exception {
        return operationlogMapper.insert(operationlog);
    }

    /**
     * 按条件显示所有的日志操作信息（wuyongfei）
     *
     * @param conditions 条件
     * @return 日志操作信息列表
     * @throws Exception 全局异常
     */
    @Override
    public PageInfo<Operationlog> listOperationLogsByConditions(Map<String, Object> conditions) throws Exception {
        OperationlogExample operationlogExample = new OperationlogExample();
        // 创建条件对象
        OperationlogExample.Criteria criteria1 = operationlogExample.createCriteria();
        // 根据条件拼接条件
        // 根据操作类型查询
        String operationType = (String) conditions.get("operationType");
        if (!"".equals(operationType) && null != operationType) {
            criteria1.andOperationtypeLike("%" + operationType + "%");
        }
        SimpleDateFormat beginSdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat endSdf = new SimpleDateFormat("yyyy-MM-dd ");
        // 根据起止时间和终止时间查询
        Date beginTime = (Date) conditions.get("beginTime");
        Date endTime = (Date) conditions.get("endTime");
        if ((!"".equals(beginTime) && null != beginTime)
                && (endTime == null || "".equals(endTime))) {
          //  beginTime = beginSdf.parse(beginSdf.format(beginTime));
            criteria1.andOperationdateGreaterThanOrEqualTo(beginTime);
        }
        // 根据时间段查询
        if ((!"".equals(beginTime) && null != beginTime)
                && (endTime != null && !"".equals(endTime))) {
           // beginTime = beginSdf.parse(beginSdf.format(beginTime));
           // endTime = beginSdf.parse(endSdf.format(endTime));
            criteria1.andOperationdateBetween(beginTime, endTime);
        }
        // 按照操作时间降序排序
        operationlogExample.setOrderByClause("operationDate desc");
        // 分页
        Integer pageNo = (Integer) conditions.get("pageNo");
        Integer pageSize = (Integer) conditions.get("pageSize");
        PageHelper.startPage(pageNo, pageSize, true);
        // 执行查询
        List<Operationlog> operationlogs = operationlogMapper.selectByExample(operationlogExample);
        for (Operationlog operationlog : operationlogs) {
            Integer roleId = operationlog.getRoleId();
            Role role = roleMapper.selectByPrimaryKey(roleId);
            operationlog.setRoleName(role.getRolename());
            Staff staff = staffMapper.selectByPrimaryKey(operationlog.getCreateBy());
            operationlog.setStaffName(staff.getStaffname());
        }
        PageInfo<Operationlog> pageInfo = new PageInfo<>(operationlogs);
        return pageInfo;
    }
}
