package com.netease.test.model.vo.response;

/**
 * 需上行短信时的提示信息
 *
 * @author xiacongling on 2017/4/6.
 */
public class UpstreamSmsHintVO {
    /**
     * 上行短信内容
     */
    private String smsText;

    /**
     * 上行短信发送的目的号码
     */
    private String smsAgent;

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getSmsAgent() {
        return smsAgent;
    }

    public void setSmsAgent(String smsAgent) {
        this.smsAgent = smsAgent;
    }
}
