package de.chkal.jersey.prio;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.LinkedHashSet;
import java.util.Set;

@ApplicationPath("r")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        LinkedHashSet<Class<?>> classes = new LinkedHashSet<>();
        classes.add(MyResource.class);
        classes.add(MyConverterProvider.class);
        return classes;
    }

}
