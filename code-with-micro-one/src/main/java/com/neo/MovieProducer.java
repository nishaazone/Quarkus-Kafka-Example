package com.neo;

import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class MovieProducer {

    @Inject
    @Channel("level")
    Emitter<String> emitter;

    public void sendMovieToKafka(String message) {
        emitter.send(message);
    }
}

