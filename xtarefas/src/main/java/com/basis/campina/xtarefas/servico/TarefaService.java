package com.basis.campina.xtarefas.servico;

import com.basis.campina.xtarefas.dominio.Responsavel;
import com.basis.campina.xtarefas.dominio.Tarefa;
import com.basis.campina.xtarefas.repositorio.TarefaRepository;
import com.basis.campina.xtarefas.servico.dto.ResponsavelDTO;
import com.basis.campina.xtarefas.servico.dto.TarefaDTO;
import com.basis.campina.xtarefas.servico.mapper.TarefaMapper;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    private final TarefaMapper tarefaMapper;

    public List<TarefaDTO> buscar(){
        return tarefaRepository.findAll().stream().map(tarefaMapper::toDTO).collect(Collectors.toList());
    }

}
