package com.sendemail.enviarcorreo.service.impl;

import com.sendemail.enviarcorreo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Servicio de envio de correo.
 */
@Service
public class MailServiceImpl implements MailService {

    /**
     * Instancia del JavaMailSender.
     */
    @Autowired
    JavaMailSender mailSender;

    @Override
    public boolean sendMail(String receiverEmail, String subject, String message) {
        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(receiverEmail);
        email.setSubject(subject);
        email.setText(message);

        mailSender.send(email);

        return true;
    }
}
