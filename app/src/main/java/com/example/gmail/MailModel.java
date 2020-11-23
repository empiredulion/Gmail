package com.example.gmail;

class MailModel {
    private String sender;
    private String subject;
    private String content;
    private String time;


    public MailModel(String sender, String subject, String content, String time) {
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.time = time;

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
