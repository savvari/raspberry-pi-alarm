package com.sridhar.domain;

import com.pi4j.io.gpio.*;

import static com.pi4j.io.gpio.PinState.HIGH;
import static com.pi4j.io.gpio.PinState.LOW;

public class Led implements Device {
    private static final Led led = new Led();
    private final GpioController gpIO;
    private final GpioPinDigitalOutput outputPin;

    private Led(){
        gpIO = GpioFactory.getInstance();
        outputPin = gpIO.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Alarm", LOW);
    }

    public static Led getInstance(){
        return led;
    }

    @Override
    public void switchOn() {
        outputPin.setState(HIGH);
    }

    @Override
    public void switchOff() {
        outputPin.setState(LOW);
    }
}
