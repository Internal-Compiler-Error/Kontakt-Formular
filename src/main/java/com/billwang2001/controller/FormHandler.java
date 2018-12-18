package com.billwang2001.controller;

import com.billwang2001.model.ContactForm;
import com.billwang2001.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class FormHandler {
    @Autowired
    private ContactFormService service;

    @CrossOrigin
    @RequestMapping(value = "contact-form", method = RequestMethod.POST)
    public ContactForm create(@RequestBody ContactForm input) {
        ContactForm form = input;
        service.save(form);
        return form;
    }

    @CrossOrigin
    @RequestMapping(value = "contact-form/{id}", method = RequestMethod.GET)
    public ContactForm retrieve(@PathVariable long id) {
        return service.get(id);
    }

    @CrossOrigin
    @RequestMapping(value = "contact-form", method = RequestMethod.GET)
    public List<ContactForm> list() {
        return service.getList();
    }

    @CrossOrigin
    @RequestMapping(value = "contact-form/{id}", method = RequestMethod.DELETE)
    public ContactForm delete(@PathVariable Long id) {
        ContactForm existingContactForm = service.get(id);
        service.delete(existingContactForm);
        return existingContactForm;
    }

    @CrossOrigin
    @RequestMapping(value = "contact-form/{id}", method = RequestMethod.PUT)
    public ContactForm put(@PathVariable Long id,
                           @RequestBody ContactForm input) {
        return service.put(id, input);
    }

}
