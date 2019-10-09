package com.test.herokutest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(path = "/index")
    public Test getIndexPage() {
        return new Test("Hello!");
    }
}
