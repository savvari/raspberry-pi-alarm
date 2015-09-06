package com.sridhar.domain;

public class Event {
    private String id;
    private String message;
    private boolean on;

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setId(String id) {
        this.id = id;
    }
}
