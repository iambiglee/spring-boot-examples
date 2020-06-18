package com.neo;

/**
 * @author BigLee E-mail:biglee001@hotmail.com
 * @date 2020/6/17 21:27
 */
public enum ReturnType {
    SUBMIT("提交"),
    APPROVE("同意"),
    BACK("回去");

    private String action;

    private ReturnType(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
