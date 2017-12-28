package com.netease.test.model.log;

import java.util.List;

/**
 * Created by hzjiaoguangcai on 2017/6/16.
 */
public class FlowLog extends BaseLog {
    /**
     * 
     */
    private String haoma;
    /**
     */
    private String token;
    private FlowTypeEnum flow;
    private StepEnum step;
    private ResultTypeEnum result= ResultTypeEnum.FAIL;
//    private ReturnCode errorType;
    private boolean loginStatus;
    private List<Rule> rules;
    private List<String> domain;

    public String getHaoma() {
        return haoma;
    }

    public void setHaoma(String haoma) {
        this.haoma = haoma;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public FlowTypeEnum getFlow() {
        return flow;
    }

    public void setFlow(FlowTypeEnum flow) {
        this.flow = flow;
    }

    public StepEnum getStep() {
        return step;
    }

    public void setStep(StepEnum step) {
        this.step = step;
    }

    public ResultTypeEnum getResult() {
        return result;
    }

    public void setResult(ResultTypeEnum result) {
        this.result = result;
    }

//    public ReturnCode getErrorType() {
//        return errorType;
//    }
//
//    public void setErrorType(ReturnCode errorType) {
//        this.errorType = errorType;
//    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }
}
