package com.sridhar.domain;

public class DummyDevice implements Device{
    private boolean on = false;

    @Override
    public void switchOn() {
        this.on = true;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }
}
