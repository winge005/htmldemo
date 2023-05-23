package com.example.htmldemo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @PostMapping(path = "/clicked")
    String indexStream(Object object) {
        return "ok";
    }

}

