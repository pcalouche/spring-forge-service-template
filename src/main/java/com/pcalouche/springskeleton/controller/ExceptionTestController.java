package com.pcalouche.springskeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionTestController {

    @GetMapping("/exception-test")
    public String exceptionTest() {
        // This will produce json output of the exception as formatted in Standard Controller Advice
        throw new RuntimeException("Exception should be caught be Standard Controller Advice");
    }
}
