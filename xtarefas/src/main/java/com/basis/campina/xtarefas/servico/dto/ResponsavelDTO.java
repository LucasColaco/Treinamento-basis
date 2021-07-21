package com.basis.campina.xtarefas.servico.dto;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponsavelDTO implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    private LocalDate dtNascimento;
}
