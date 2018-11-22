package com.billwang2001.controller;

import com.billwang2001.model.ContactForm;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FormHandler {

    @RequestMapping(value = "contactForm", method = RequestMethod.POST)
    public ContactForm create(@RequestBody ContactForm input) {
        ContactForm form = input;
        return form;
    }

    public ContactForm get(@PathVariable Long id) {
        return null;
    }
}
