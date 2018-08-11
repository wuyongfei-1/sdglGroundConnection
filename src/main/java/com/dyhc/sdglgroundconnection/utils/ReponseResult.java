package com.dyhc.sdglgroundconnection.utils;


/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 响应信息主体。返回给前端的数据
 **/
public class ReponseResult<T> {
    private String code = "";   // 响应编码
    private String codeLabel = "";  // 成功/失败标签
    private String message = "";    // 成功/失败提示信息
    private T data;   // 携带的数据

    /**
     * 成功返回给前端页面的数据
     *
     * @param data    携带数据
     * @param message 成功提示
     * @return
     */
    public static <T> ReponseResult<T> ok(T data, String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_SUCCESS);
        reponseResult.setCodeLabel(ReponseCode.LABEL_SUCCESS);
        reponseResult.setData(data);
        reponseResult.setMessage(message);
        return reponseResult;
    }

    /**
     * 成功返回给前端页面的数据
     *
     * @param message 成功提示
     * @return
     */
    public static <T> ReponseResult<T> ok(String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_SUCCESS);
        reponseResult.setCodeLabel(ReponseCode.LABEL_SUCCESS);
        reponseResult.setData(null);
        reponseResult.setMessage(message);
        return reponseResult;
    }

    /**
     * 出现失败返回给前端页面的数据
     *
     * @param message 失败提示
     * @return
     */
    public static <T> ReponseResult<T> err(String message) {
        ReponseResult<T> reponseResult = new ReponseResult<>();
        reponseResult.setCode(ReponseCode.CODE_ERROR);
        reponseResult.setCodeLabel(ReponseCode.LABEL_ERROR);
        reponseResult.setData(null);
        reponseResult.setMessage(message);
        return reponseResult;
    }

    public String getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(String codeLabel) {
        this.codeLabel = codeLabel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
