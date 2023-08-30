package com.agorohov.spring.mywebapp1.dao;

import com.agorohov.spring.mywebapp1.entity.Contact;
import java.util.List;

public interface ContactDAO {
    
    public List<Contact> getAllContacts();
    public void saveContact(Contact contact);
    public Contact getContact(int id);
    public void deleteContact(int id);
}
