package com.budomuya.webservice.model;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
public class BaseModel {

    private boolean success;
    private String errMsg;

    public BaseModel() {
        this.success = true;
        this.errMsg = "";
    }

    public BaseModel(boolean success, String errMsg) {
        this.success = success;
        this.errMsg = errMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
