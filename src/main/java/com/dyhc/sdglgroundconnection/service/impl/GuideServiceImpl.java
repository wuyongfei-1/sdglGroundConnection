package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.exception.DispatchException;
import com.dyhc.sdglgroundconnection.jms.ActiveMQUtil;
import com.dyhc.sdglgroundconnection.mapper.GuideMapper;
import com.dyhc.sdglgroundconnection.mapper.GuideScheduleMapper;
import com.dyhc.sdglgroundconnection.pojo.Guide;
import com.dyhc.sdglgroundconnection.pojo.GuideExample;
import com.dyhc.sdglgroundconnection.pojo.GuideSchedule;
import com.dyhc.sdglgroundconnection.pojo.GuideScheduleExample;
import com.dyhc.sdglgroundconnection.service.GuideService;
import com.dyhc.sdglgroundconnection.utils.EncryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游业务实现
 **/
@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;

    @Autowired
    private ActiveMQUtil activeMQUtil;

    @Autowired
    private GuideScheduleMapper guideScheduleMapper;

    //private Guide guide; // 存放消息队列处理完返回的信息

    /**
     * 获取所有的导游信息（不分页）（wuyongfei）
     *
     * @return 导游列表
     * @throws DispatchException 调度异常
     */
    @Override
    public List<Guide> listAllGuides() throws DispatchException {
        return guideMapper.selectAll();
    }

    /**
     * 导游登陆业务实现（wuyongfei）
     *
     * @param username 用户名
     * @return 导游对象
     * @throws Exception 全局异常0
     */
    @Override
    public Guide login(String username) throws Exception {
        GuideExample guideExample = new GuideExample();
        GuideExample.Criteria criteria = guideExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Guide> guides = guideMapper.selectByExample(guideExample);
        return (guides != null && guides.size() > 0) ? guides.get(0) : null;
    }

//    /**
//     * MQ监听器 & 导游登陆（wuyongfei）
//     *
//     * @param username 用户名
//     */
//    @JmsListener(destination = "guide.login")
//    public void reveiveQueueFromLogin(String username) {
//        GuideExample guideExample = new GuideExample();
//        GuideExample.Criteria criteria = guideExample.createCriteria();
//        criteria.andUsernameEqualTo(username);
//        List<Guide> guides = guideMapper.selectByExample(guideExample);
//        guide = (guides != null && guides.size() > 0) ? guides.get(0) : null;
//    }

    /**
     * 导游名称分页查询(yunguohao)
     *
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
     *
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "添加了一条导游信息")
    public int insertGuide(Guide guide)throws Exception {
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
     *
     * @param guide
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "修改了一条导游信息")
    public int updateGuide(Guide guide)throws Exception {
        Guide offguide=guideMapper.selectByPrimaryKey(guide.getGuideId());
        System.out.println(offguide.getModifiedData());
        guide.setUsername(offguide.getUsername());
        guide.setPassword(offguide.getPassword());
        guide.setCreater(offguide.getCreater());
        guide.setCreationDate(offguide.getCreationDate());
        guide.setWhetherDel(0);
        return guideMapper.updateByPrimaryKey(guide);
    }

    /**
     * 导游删除(yunguohao)
     *
     * @param guideid
     * @return
     */
    @Override
    @RecordOperation(type = "导游", desc = "删除了一条导游信息")
    public int deleteGuideByIDs(int guideid)throws Exception {
        return guideMapper.deleteGuide(guideid);
    }

    /**
     * 导游id查询(yunguohao)
     *
     * @param id
     * @return
     */
    @Override
    public Guide selectGuideByIds(int id) throws Exception {
        return guideMapper.selectByPrimaryKey(id);
    }



    /**
     * 获取所有导游和导游日程（lixiaojie)
     * @return
     */
    @Override
    public List<Guide> selectGuideInfoAndGuideSchedule() {
        GuideExample guideExample =new GuideExample();
        GuideExample.Criteria guideCriteria=guideExample.createCriteria();
        guideCriteria.andWhetherdelEqualTo(0);
        List<Guide> guides=guideMapper.selectByExample(guideExample);  //根据条件获取所有导游信息


        for (Guide item:guides) {  //循环导游信息  为每位导游赋上导游日程信息
            GuideScheduleExample guideScheduleExample =new GuideScheduleExample();
            GuideScheduleExample.Criteria guideScheduleCriteria=guideScheduleExample.createCriteria();
            guideScheduleCriteria.andGuideidEqualTo(item.getGuideId());
            guideScheduleCriteria.andValue1EqualTo("0");
            guideScheduleExample.setOrderByClause("schedulebegintime");   //设置导游日程条件
            List<GuideSchedule> guideSchedules=guideScheduleMapper.selectByExample(guideScheduleExample);//查询
            item.setGuideScheduleList(guideSchedules);//将每次查到的放入集合
        }
        return guides;
    }
    /**
     * 查询所有导游信息(lixiaojie)
     * @return
     */
    @Override
    public List<Guide> selectAllGuideInfo() {
        GuideExample guideExample =new GuideExample();
        GuideExample.Criteria guideCriteria=guideExample.createCriteria();
        guideCriteria.andWhetherdelEqualTo(0);
        List<Guide> guides=guideMapper.selectByExample(guideExample);
        return guides;
    }

    /**
     * 更具导游编号查询导游信息（yunguohao）微信
     * @param guideId
     * @return
     */
    @Override
    public Guide getguideById(Integer guideId) throws Exception {
        GuideExample guideExample =new GuideExample();
        GuideExample.Criteria criteria=guideExample.createCriteria();
        criteria.andGuideidEqualTo(guideId);
        return guideMapper.selectByExample(guideExample).get(0);
    }

    /**
     * 修改密码（yunguohao）微信
     */
    @Override
    public int updateByGuideId(Guide guide) throws Exception {
        Guide offguide=guideMapper.selectByPrimaryKey(guide.getGuideId());
        guide.setGuideName(offguide.getGuideName());
      guide.setUsername(offguide.getUsername());
      guide.setModifiedData(new Date());
      guide.setModifier(guide.getGuideId());
      guide.setCreater(offguide.getCreater());
      guide.setCreationDate(offguide.getCreationDate());
      guide.setWhetherDel(0);
      guide.setAge(offguide.getAge());
      guide.setSex(offguide.getSex());
      guide.setState(offguide.getState());
      guide.setCertificate(offguide.getCertificate());
      guide.setTelephone(offguide.getTelephone());
        return guideMapper.updateByPrimaryKey(guide);
    }


}
