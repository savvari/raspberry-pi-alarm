package com.sridhar.domain;

import java.util.Collection;
import java.util.List;

public class EventResponse {
    private boolean alarmOn;
    private Collection<Event> eventList;

    public EventResponse(boolean alarmOn, Collection<Event> eventList) {
        this.alarmOn = alarmOn;
        this.eventList = eventList;
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }

    public void setAlarmOn(boolean alarmOn) {
        this.alarmOn = alarmOn;
    }

    public Collection<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
