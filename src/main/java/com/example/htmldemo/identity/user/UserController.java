package com.example.htmldemo.identity.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping("/public")
public class UserController {

    static final String MESSAGE = "message";
    static final String ERROR = "error";

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/ping", produces = "text/plain")
    @ResponseBody
    String ping(@RequestParam(name = "debug", required = false) String debug) {
        if (debug != null && debug.length() > 0) {
            return "OK " + new Date() + " " + debug;
        }
        return "OK " + new Date();
    }
}