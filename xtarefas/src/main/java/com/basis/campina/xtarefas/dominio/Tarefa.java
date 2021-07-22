package com.basis.campina.xtarefas.dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_TAREFA")
@Getter
@Setter
@NoArgsConstructor
public class Tarefa implements Serializable {
    private static final long serialVersionUID = -105928580546167973L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TAREFA")
    @SequenceGenerator(name = "SEQ_TAREFA", sequenceName = "SEQ_TAREFA", allocationSize = 1)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DT_INICIO")
    private LocalDate dtInicio;

    @Column(name = "DT_CONCLUSAO")
    private LocalDate dtConclusao;

    @Column(name = "STATUS")
    private String status;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TAREFA_ID")
    private List<Anexo> anexos;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Responsavel.class)
    private Responsavel responsavel;

}
