package com.sridhar.service;

import com.sridhar.domain.Alarm;
import com.sridhar.domain.Event;
import com.sridhar.domain.EventResponse;

import java.util.HashMap;
import java.util.Map;

public class EventHandler {
    public Map<String, Event> eventsWhichSetOffTheAlarm = new HashMap<>();
    private Alarm alarm;

    public EventHandler(final Alarm alarm) {
        this.alarm = alarm;
    }

    public synchronized EventResponse handle(Event event){
        if(event.isOn()) {
            addEvent(event);
            alarm.start();
        } else {
            removeEvent(event);
            if(eventsWhichSetOffTheAlarm.size() == 0) {
                alarm.stop();
            }
        }

        return new EventResponse(alarm.isOn(), eventsWhichSetOffTheAlarm.values());
    }

    private void removeEvent(Event event) {
        eventsWhichSetOffTheAlarm.remove(event.getId());
    }

    private void addEvent(Event event) {
        eventsWhichSetOffTheAlarm.put(event.getId(), event);
    }
}
