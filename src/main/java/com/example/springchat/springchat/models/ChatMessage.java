package com.example.springchat.springchat.models;

import java.time.LocalTime;

public class ChatMessage {
    private String content;
    private String sender;
    private Messagetype type;
    private LocalTime timeSent;

    public String getTimeSent() {
        long millis = System.currentTimeMillis();

        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);
        return String.valueOf(date);
    }

    public void setTimeSent(LocalTime timeSent) {
        this.timeSent = timeSent;
    }

    public enum Messagetype{
        CHAT, LEAVE, JOIN
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Messagetype getType() {
        return type;
    }

    public void setType(Messagetype type) {
        this.type = type;
    }
}
