package com.sendemail.enviarcorreo.web.controller;

import com.sendemail.enviarcorreo.model.entity.Email;
import com.sendemail.enviarcorreo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador del servicio del formulador.
 *
 * @author Jose Daniel
 */
@RestController
public class MailController {

    /**
     * Instancia del servicio de envio de correo.
     */
    @Autowired
    private MailService mailService;

    @PostMapping("enviarCorreo")
    public ResponseEntity<Boolean> sendMail(@RequestBody Email mail){
        Boolean response = mailService.sendMail(mail.getReceiverEmail(), mail.getSubject(),
                mail.getMessage());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
