package com.kafka.realapplication.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WikimediaChangesProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangesProducer.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(){
        String topic = "wikimedia-recentchange";
    }

}
