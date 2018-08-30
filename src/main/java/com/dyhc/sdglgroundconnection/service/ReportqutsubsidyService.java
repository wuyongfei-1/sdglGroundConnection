package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportqutsubsidy;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账出团补助业务接口
 **/
public interface ReportqutsubsidyService {

    /**
     * 根据报账编号查询报账出团补助信息
     * @param value1 报账编号
     * @return 报账出团补助信息对象
     */
    Reportqutsubsidy getReportqutsubsidyByValueId(Integer value1);

    /**
     * 添加出团补助信息
     * @param reportqutsubsidy 出团补助对象
     * @return 返回受影响行数
     */
    Integer insertReportqutsubsidyInfo(Reportqutsubsidy reportqutsubsidy);
}
