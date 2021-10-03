package com.ms.email.dtos;

import lombok.Data;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @NotBlank //anotação que verifica automaticamente se o campo esta em branco no POST
    private String ownerRef;
    @NotBlank //anotação que verifica automaticamente se o campo esta em branco no POST
    @Email //verifica se é um e-mail valido
    private String emailFrom;
    @NotBlank //anotação que verifica automaticamente se o campo esta em branco no POST
    @Email //verifica se é um e-mail valido
    private String emailTo;
    @NotBlank //anotação que verifica automaticamente se o campo esta em branco no POST
    private String subject;
    @NotBlank //anotação que verifica automaticamente se o campo esta em branco no POST
    private String text;
}
