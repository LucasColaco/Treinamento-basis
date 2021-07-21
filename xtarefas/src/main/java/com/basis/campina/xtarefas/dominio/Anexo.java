package com.basis.campina.xtarefas.dominio;

import java.io.Serializable;
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
public class Anexo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ANEXO")
    @SequenceGenerator(name = "SEQ_ANEXO", sequenceName = "SEQ_ANEXO", allocationSize = 1)
    private Integer id;

    @Column(name = "FILE", nullable = false)
    private String file;

    @Column(name = "FILE_NAME", nullable = false)
    private String fileName;
}
