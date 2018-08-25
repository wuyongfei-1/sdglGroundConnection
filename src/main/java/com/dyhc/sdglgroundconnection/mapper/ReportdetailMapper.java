package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Reportdetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账明细
 **/
@Mapper
@Component
public interface ReportdetailMapper extends CommonMapper<Reportdetail>{
    /**
     * 报账日期区间查询
     * @param
     * @return
     */
    List<Reportdetail> selectreportDate(@Param("sdate")String sdate, @Param("edate")String edate);


    /**
     * 按调度编号查询
     * @param dispatchId
     * @return
     */
    List<Reportdetail> selectDispatchId(int dispatchId);
}
