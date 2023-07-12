package com.chirag.localisation.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    
    private final MessageSource messageSource;

    public TextController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/greeting")
    public String greeting(Locale locale) {
        return messageSource.getMessage("greeting", null, locale);
    }

}
