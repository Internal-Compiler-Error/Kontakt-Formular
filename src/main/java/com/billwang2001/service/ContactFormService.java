package com.billwang2001.service;

import com.billwang2001.model.ContactForm;
import com.billwang2001.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactFormService {
    @Autowired
    private ContactFormRepository repository;

    public ContactForm save(ContactForm contactForm) {
        return repository.save(contactForm);
    }

    public ContactForm get(Long id) {
        return repository.getOne(id);
    }

    public List<ContactForm> getList() {
        return repository.findAll();
    }

    public void delete(ContactForm contactForm) {
        repository.delete(contactForm);
    }
}
