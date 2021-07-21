package com.basis.campina.xtarefas.servico.dto;

import com.basis.campina.xtarefas.dominio.Anexo;
import com.basis.campina.xtarefas.dominio.Responsavel;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TarefaDTO implements Serializable {

    private Integer id;
    private String nome;
    private LocalDate dtInicio;
    private LocalDate dtConclusao;
    private String status;
    private List<Anexo> anexos;
    private Responsavel responsavel;
}
