package com.example.springchat.springchat.models;

public class ChatMessage {
    private String content;
    private String sender;
    private Messagetype type;

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
