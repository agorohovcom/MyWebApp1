package com.agorohov.spring.mywebapp1.service;

import com.agorohov.spring.mywebapp1.dao.ContactDAO;
import com.agorohov.spring.mywebapp1.entity.Contact;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService{
    
    @Autowired
    private ContactDAO contactDAO;

    @Override
    @Transactional
    public List<Contact> getAllContacts() {
        return contactDAO.getAllContacts();
    }

    @Override
    @Transactional
    public void saveContact(Contact contact) {
        contactDAO.saveContact(contact);
    }

    @Override
    @Transactional
    public Contact getContact(int id) {
        return contactDAO.getContact(id);
    }

    @Override
    @Transactional
    public void deleteContact(int id) {
        contactDAO.deleteContact(id);
    }
    
}
