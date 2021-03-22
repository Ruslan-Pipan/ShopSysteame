package com.shop.systeme.services.emailServise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;

@Component
public class NewProductNotifierEmailService implements EmailService{

    @Autowired
    private JavaMailSender sender;

    @Override
    public void send(String emailTo, String subject, String body) {
        MimeMessagePreparator message = newMessage -> {
            newMessage.setRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(emailTo)
            );
            newMessage.setFrom("ruslanpipan4@gmail.com");
            newMessage.setSubject(subject);
            newMessage.setText(body);
        };
        this.sender.send(message);
    }

}

