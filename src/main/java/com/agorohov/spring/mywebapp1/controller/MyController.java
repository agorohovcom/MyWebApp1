package com.agorohov.spring.mywebapp1.controller;

import com.agorohov.spring.mywebapp1.entity.Contact;
import com.agorohov.spring.mywebapp1.service.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    
    @Autowired
    private ContactService contactServise;
    
    @RequestMapping("/")
    public String firstView (Model model){
        return "first-view";
    }
    
    @RequestMapping("/allContacts")
    public String allContacts (Model model) {
        
        List<Contact> contacts = contactServise.getAllContacts();
        model.addAttribute("allContacts", contacts);
        
        return "all-contacts";
    }
}
