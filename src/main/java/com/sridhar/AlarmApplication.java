package com.sridhar;

import com.sridhar.config.AlarmApplicationConfig;
import com.sridhar.domain.Alarm;
import com.sridhar.domain.Device;
import com.sridhar.domain.DummyDevice;
import com.sridhar.domain.Led;
import com.sridhar.resources.AlarmResource;
import com.sridhar.service.EventHandler;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class AlarmApplication extends Application<AlarmApplicationConfig> {
    public static void main(String[] args) throws Exception {
        new AlarmApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AlarmApplicationConfig> bootstrap) {}

    @Override
    public void run(AlarmApplicationConfig configuration, Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/service/*");

//        Device device = Led.getInstance();
        Device device = new DummyDevice();
        Alarm alarm = new Alarm(device);
        EventHandler eventHandler = new EventHandler(alarm);
        environment.jersey().register(new AlarmResource(eventHandler));
    }
}
