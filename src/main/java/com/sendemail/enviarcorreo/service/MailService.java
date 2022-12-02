package com.sendemail.enviarcorreo.service;

/**
 * Interfaz del servicio de envio de correo.
 *
 * @author Jose Daniel
 */
public interface MailService {

    /**
     * Se envia el correo.
     */
    public boolean sendMail(final String receiverEmail, final String subject,
                              final String message);
}
