package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("greeting")
public class GreetingResource {
    @Inject
    @ConfigProperty(name = "greeting.name", defaultValue = "Bob")
    private String name;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return Json.createObjectBuilder().add("greetings", name).build().toString();
    }
}