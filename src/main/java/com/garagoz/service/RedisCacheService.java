package com.garagoz.service;

public class RedisCacheService {

    public String longRunningMethod() throws  InterruptedException {
        Thread.sleep(5000L);
        return "method is running";
    }
}
