package com.agorohov.spring.mywebapp1.service;

import com.agorohov.spring.mywebapp1.entity.Contact;
import java.util.List;

public interface ContactService {
    
    public List<Contact> getAllContacts();
    public void saveContact(Contact contact);
    public Contact getContact(int id);
    public void deleteContact(int id);
    
}
