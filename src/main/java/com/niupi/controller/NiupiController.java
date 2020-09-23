package com.niupi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;


@RequestMapping(value = "/niupi/")
@RestController
@Slf4j
public class NiupiController {

    @GetMapping(value = "/get")
    @ResponseStatus(HttpStatus.OK)
    public String getOperation() {
        log.info("Calling Get Operation");
        return "Hello World, this 54321";
    }

    @PostMapping(value = "/post")
    @ResponseStatus(HttpStatus.OK)
    public String postOperation() {
        log.info("Calling Post Operation");
        return "This is a post abcd";
    }




}
