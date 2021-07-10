package com.biggview.bgemailservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailDetails {
    @JsonProperty("Subject")
    private String subject;
    @JsonProperty("Body")
    private String body;
    @JsonProperty("SendTo")
    private String sendTo;
    @JsonProperty("SentFrom")
    private String sentFrom;

    public EmailDetails() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getSentFrom() {
        return sentFrom;
    }

    public void setSentFrom(String sentFrom) {
        this.sentFrom = sentFrom;
    }
}
