package com.basis.campina.xtarefas.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_ANEXO")
@Getter
@Setter
@NoArgsConstructor
public class Anexo implements Serializable {
    private static final long serialVersionUID = 6900062699425751228L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ANEXO")
    @SequenceGenerator(name = "SEQ_ANEXO", sequenceName = "SEQ_ANEXO", allocationSize = 1)
    private Integer id;

    @Column(name = "FILE")
    private String file;

    @Column(name = "FILE_NAME")
    private String fileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TAREFA_ID", referencedColumnName = "ID")
    private Tarefa tarefa;
}
