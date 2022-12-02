package com.sendemail.enviarcorreo.controllador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviarCorreo {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("enviarCorreo")
    public boolean enviarCorreo(){

        SimpleMailMessage email = new SimpleMailMessage();

        //destino
        email.setTo("jose285600@gmail.com");
        //cuenta de donde envia
        email.setFrom("jose.rivera@utp.edu.co");
        email.setSubject("Mensaje de prueba");
        email.setText("No responder");

        mailSender.send(email);

        return true;
    }
}
