package com.kafka.realapplication.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaChangesConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangesConsumer.class);

    @KafkaListener(topics = "wikimedia-recentchange", groupId = "myGroup")
    public void consume(String eventMessage){

        LOGGER.info("Mensagem de evento recebida -> " + eventMessage);

    }

}
