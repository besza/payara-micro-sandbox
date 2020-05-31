package ${groupId};

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("greeting")
public class GreetingResource {
    @Inject
    @ConfigProperty(name = "greeting.name", defaultValue = "Bob")
    private String name;

    @GET
    public String sayHello() {
        return "Hello " + name + "!";
    }
}