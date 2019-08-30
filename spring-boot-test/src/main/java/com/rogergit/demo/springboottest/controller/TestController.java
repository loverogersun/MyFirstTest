package com.rogergit.demo.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author noah
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(value = "hello")
    public String helloWorld() {
        return "Hello, World";
    }
}
