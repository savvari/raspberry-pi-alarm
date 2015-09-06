package com.sridhar.domain;

public class Alarm {
    private boolean on;
    private Device device;

    public Alarm(Device device){
        this.on = false;
        this.device = device;
    }

    public boolean start(){
        if(!on){
            device.switchOn();
            on = true;
        }

        return on;
    }

    public boolean stop(){
        if(on){
            device.switchOff();
            on = false;
        }

        return on;
    }

    public boolean isOn() {
        return on;
    }
}
