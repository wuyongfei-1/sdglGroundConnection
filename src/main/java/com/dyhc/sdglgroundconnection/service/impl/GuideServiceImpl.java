package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游业务实现
 **/
@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;

    /**
     * 导游名称分页查询(yunguohao)
     * @param pageNo
     * @param PageSize
     * @param guide
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<Guide> listGuide(Integer pageNo, Integer PageSize, Guide guide) throws Exception {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Guide> pageInfo = new PageInfo<>(guideMapper.selectGuideName(guide));
        return pageInfo;
    }

    /**
     * 导游添加(yunguohao)
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "添加了一条导游信息")
    public int insertGuide(Guide guide) {
        guide.setWhetherDel(0);
        guide.setState(3);
        guide.setPassword(EncryUtil.encrypt("123456"));//密码加密
        SimpleDateFormat sdf = new SimpleDateFormat("ss");//获取当前秒
        Date date = new Date();
        String currentDateTime = sdf.format(date);//将秒转成字符串

        int flag = new Random().nextInt(99) + 1000;//生成随机数
        flag = (int) Math.floor(flag);
        if (flag < 1) {
            flag += 1;
        }

        String TheUserName = "GUIDE" + currentDateTime + flag;//拼接这些字符
        guide.setUsername(TheUserName);
        return guideMapper.insert(guide);
    }
    /**
     * 导游修改(yunguohao)
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "修改了一条导游信息")
    public int updateGuide(Guide guide) {
        guide.setWhetherDel(0);
        return guideMapper.updateByPrimaryKey(guide);
    }
    /**
     * 导游删除(yunguohao)
     * @param guideid
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "删除了一条导游信息")
    public int deleteGuideByIDs(int guideid) {
        return guideMapper.deleteGuide(guideid);
    }
    /**
     * 导游id查询(yunguohao)
     * @param id
     * @return
     */
    @Override
    public Guide selectGuideByIds(int id) {
        return guideMapper.selectByPrimaryKey(id);
    }
}
