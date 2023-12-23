package com.garagoz.service;

import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    public String longRunningMethod() throws  InterruptedException {
        Thread.sleep(5000L);
        return "method is running";
    }
}
