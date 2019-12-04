package hu.veres.domokos;

import hu.veres.domokos.model.MessageResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MessageResponse hello() {
        return MessageResponse.builder()
                .withMessage("Hello")
                .build();
    }
}