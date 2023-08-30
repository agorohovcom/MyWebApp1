package com.agorohov.spring.mywebapp1.dao;

import com.agorohov.spring.mywebapp1.entity.Contact;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

    @Override
    public void saveContact(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(contact);
        session.merge(contact);
    }

    @Override
    public Contact getContact(int id) {
        Session session = sessionFactory.getCurrentSession();
        Contact contact = session.get(Contact.class, id);
        return contact;
    }

    @Override
    public void deleteContact(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Contact> query = session.createQuery("delete from Contact where id = " + id);
        query.executeUpdate();
    }
}
