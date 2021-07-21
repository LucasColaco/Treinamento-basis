package com.basis.campina.xtarefas.dominio;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_RESPONSAVEL")
@Getter
@Setter
@NoArgsConstructor
public class Responsavel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RESPONSAVEL")
    @SequenceGenerator(name = "SEQ_RESPONSAVEL", sequenceName = "SEQ_RESPONSAVEL", allocationSize = 1)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate dtNascimento;

}
