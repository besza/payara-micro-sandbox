package org.acme;

import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("greeting")
public class GreetingResource {
    @Inject
    @ConfigProperty(name = "greeting.name", defaultValue = "Tom")
    private String name;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return Json.createObjectBuilder().add("greetings", name).build().toString();
    }
}