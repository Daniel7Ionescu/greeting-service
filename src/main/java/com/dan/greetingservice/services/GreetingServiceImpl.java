package com.dan.greetingservice.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting(String name) {
        log.info("Greeted: " + name);
        return "Greetings " + name + "!";
    }
}
