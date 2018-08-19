package com.dyhc.sdglgroundconnection.utils;


/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 响应信息主体。返回给前端的数据（wuyongfei）
 **/
public class ReponseResult<T> {
    private String code = "";   // 响应编码
    private String msg = "";    // 成功/失败提示信息
    private T data;   // 携带的数据
    private Long count; // 数据的总数 （分页附加）

    /**
     * 成功返回给前端页面分页后的数据（带分页）（wuyongfei）
     *
     * @param data      携带数据
     * @param infoCount 数据量
     * @param message   成功提示
     * @return
     */
    public static <T> ReponseResult<T> ok(T data, Long infoCount, String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_SUCCESS);
        reponseResult.setCount(infoCount);
        reponseResult.setData(data);
        reponseResult.setMsg(message);
        return reponseResult;
    }

    /**
     * 成功返回给前端页面的数据（不带分页）（wuyongfei）
     *
     * @param data    携带数据
     * @param message 成功提示
     * @return
     */
    public static <T> ReponseResult<T> ok(T data, String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_SUCCESS);
        reponseResult.setCount(0L);
        reponseResult.setData(data);
        reponseResult.setMsg(message);
        return reponseResult;
    }

    /**
     * 成功返回给前端页面的数据（wuyongfei）
     *
     * @param message 成功提示
     * @return
     */
    public static <T> ReponseResult<T> ok(String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_SUCCESS);
        reponseResult.setCount(0L);
        reponseResult.setData(null);
        reponseResult.setMsg(message);
        return reponseResult;
    }

    /**
     * 出现失败返回给前端页面的数据（wuyongfei）
     *
     * @param message 失败提示
     * @return
     */
    public static <T> ReponseResult<T> err(String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_ERROR);
        reponseResult.setData(null);
        reponseResult.setMsg(message);
        return reponseResult;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
