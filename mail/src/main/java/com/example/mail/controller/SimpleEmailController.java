package com.example.mail.controller;

import com.example.mail.models.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class SimpleEmailController {

    @Autowired
    public JavaMailSender javaMailSender;
    Email email;

    @GetMapping(value = "/sendEmail")
    public String sendEmail(){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(email.getTo());
        message.setSubject("Springboot Application");
        message.setText("Hi How are you");
        javaMailSender.send(message);
        return "Successfully sent Email";

    }
    @PostMapping(value = "/sendEmail1")
    public String sendEmail(@RequestBody Email email){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo(email.getTo());
        message.setSubject(email.getMessageSubject());
        message.setText(email.getMessageBody());
        javaMailSender.send(message);
        return "Successfully sent Email";

    }

}