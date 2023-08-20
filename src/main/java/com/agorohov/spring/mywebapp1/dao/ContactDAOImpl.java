package com.agorohov.spring.mywebapp1.dao;

import com.agorohov.spring.mywebapp1.entity.Contact;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Contact> getAllContacts() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Contact", Contact.class)
                        .getResultList();
    }

}
