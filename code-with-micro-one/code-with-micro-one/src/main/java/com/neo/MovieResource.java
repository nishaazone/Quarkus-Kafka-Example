package com.neo;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/send")
public class MovieResource {

    @Inject
    MovieProducer producer;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String sendMessage(String message) {
        producer.sendMovieToKafka(message);
        return "Message sent: " + message;
    }
}
