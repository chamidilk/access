package com.ac.ux.web.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping(value = "/api")
public class FcController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());




    @Autowired
    private MessageSource messages;

    @Autowired
    private Environment env;









}
