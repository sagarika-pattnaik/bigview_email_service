package com.biggview.bgemailservice.controller;

import com.biggview.bgemailservice.entity.EmailDetails;
import com.biggview.bgemailservice.sendEmail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class BgEmailServiceController {
    @Autowired
    EmailService emailService;

    @PostMapping({ "/sendEmail" })
    @CrossOrigin(origins = {"https://biggview.com/","www.biggview.com","https://148.72.244.22:3000","https://148.72.244.22:8080","https://www.biggview.com"})
    public List<String> createEmployee(@RequestBody final EmailDetails emailDetails) {
        emailDetails.setSendTo("heebookingmgt@gmail.com");
        System.out.println("value of Body is:" + emailDetails.getBody());
        System.out.println("value of Sent to is :" + emailDetails.getSendTo());
        System.out.println("value of subject is :" + emailDetails.getSubject());
        this.emailService.sendSimpleMessage(emailDetails.getSendTo(), emailDetails.getSubject(), emailDetails.getBody());
        final List<String> response = new ArrayList<>();
        response.add("Email sent successfully");
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {

        return "welcome to spring boot application";

    }
}
