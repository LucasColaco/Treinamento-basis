package com.basis.campina.xtarefas.servico.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AnexoDTO implements Serializable {

    private Integer id;
    private String file;
    private String fileName;
}
