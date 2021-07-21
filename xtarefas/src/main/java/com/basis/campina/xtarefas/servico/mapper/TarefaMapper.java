package com.basis.campina.xtarefas.servico.mapper;

import com.basis.campina.xtarefas.dominio.Responsavel;
import com.basis.campina.xtarefas.dominio.Tarefa;
import com.basis.campina.xtarefas.servico.dto.ResponsavelDTO;
import com.basis.campina.xtarefas.servico.dto.TarefaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaMapper {

    Tarefa toEntity(TarefaDTO dto);

    TarefaDTO toDTO(Tarefa obj);
}
