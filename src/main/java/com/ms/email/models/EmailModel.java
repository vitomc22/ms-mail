package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data //anotação do lombok para nao precisar criar getters setters e constructors, usar em teste pq come memoria e processamento
@Entity
@Table(name = "TB_EMAIL")

public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT") //define tipo text do banco, maior que string para inserção de caracteres
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

}
