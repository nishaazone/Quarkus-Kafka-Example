package com.neo;


import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class MovieConsumer {

    @Incoming("level")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

