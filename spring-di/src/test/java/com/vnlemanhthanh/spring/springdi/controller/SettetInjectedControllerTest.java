/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.springdi.controller;

import com.vnlemanhthanh.spring.springdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettetInjectedControllerTest {

    SettetInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SettetInjectedController();

        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());;
    }
}