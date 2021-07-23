package com.biggview.bgemailservice.controller;

import com.biggview.bgemailservice.entity.EmailDetails;
import com.biggview.bgemailservice.sendEmail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class BgEmailServiceController {
    @Autowired
    EmailService emailService;

    @PostMapping({ "/sendEmail" })
    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:3000","https://biggview.com/","https://3.7.159.102:8080","www.biggview.com"})
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
}
