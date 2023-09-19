/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.springdi.service;

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Say Greeting! - From the Primary Bean";
    }
}
