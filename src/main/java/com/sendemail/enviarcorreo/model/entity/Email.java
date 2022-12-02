package com.sendemail.enviarcorreo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Esta entidad almacena los datos que componen el correo.
 *
 * @author Jose Daniel
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    /**
     * correo destino.
     */
    private String receiverEmail;

    /**
     * Asunto correo.
     */
    private String subject;

    /**
     * Mensaje de correo.
     */
    private String message;
}
