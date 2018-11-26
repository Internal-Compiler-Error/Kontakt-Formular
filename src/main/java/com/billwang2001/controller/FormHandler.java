package com.billwang2001.controller;

import com.billwang2001.model.ContactForm;
import com.billwang2001.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FormHandler {
    @Autowired
    private ContactFormService service;


    @RequestMapping(value = "contactForm", method = RequestMethod.POST)
    public ContactForm create(@RequestBody ContactForm input) {
        ContactForm form = input;
        service.save(form);
        return form;
    }

    public ContactForm get(@PathVariable Long id) {
        return null;
    }
}
