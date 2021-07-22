package com.basis.campina.xtarefas.servico.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DocumentoDTO {

    private String uuId;

    @NotNull
    private String file;
}
