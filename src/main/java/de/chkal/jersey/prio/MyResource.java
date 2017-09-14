package de.chkal.jersey.prio;

import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/param/{value}")
@ValidateOnExecution(type = ExecutableType.NONE)
public class MyResource {

    @PathParam("value")
    private Integer value;

    @GET
    public String get() {
        return "Value injected via @PathParam: " + value;
    }

}


