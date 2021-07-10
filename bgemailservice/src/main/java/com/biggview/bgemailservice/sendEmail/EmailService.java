package com.biggview.bgemailservice.sendEmail;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
