package com.sridhar.resources;

import com.sridhar.domain.Event;
import com.sridhar.domain.EventResponse;
import com.sridhar.service.EventHandler;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("alarm")
public class AlarmResource {
    private EventHandler eventHandler;

    public AlarmResource(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public EventResponse changeStatus(Event event){
        return eventHandler.handle(event);
    }
}
