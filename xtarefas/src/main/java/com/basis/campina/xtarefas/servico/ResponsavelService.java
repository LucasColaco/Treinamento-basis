package com.basis.campina.xtarefas.servico;

import com.basis.campina.xtarefas.dominio.Responsavel;
import com.basis.campina.xtarefas.repositorio.ResponsavelRepository;
import com.basis.campina.xtarefas.servico.dto.ResponsavelDTO;
import com.basis.campina.xtarefas.servico.mapper.ResponsavelMapper;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ResponsavelService {

    private final ResponsavelRepository responsavelRepository;

    private final ResponsavelMapper responsavelMapper;

    public List<ResponsavelDTO> buscar(){
        return responsavelRepository.findAll().stream().map(responsavelMapper::toDTO).collect(Collectors.toList());
    }

    public ResponsavelDTO buscarPorId(Integer id){
        Responsavel responsavel = responsavelRepository.findById(id).orElseThrow(()->new RuntimeException("Responsável não encontrado"));
        return responsavelMapper.toDTO(responsavel);
    }

    public ResponsavelDTO salvar(ResponsavelDTO responsavelDTO){
        Responsavel obj = responsavelMapper.toEntity(responsavelDTO);
        obj = responsavelRepository.save(obj);
        return responsavelMapper.toDTO(obj);
    }

    public void remover(Integer id){
        buscarPorId(id);
        responsavelRepository.deleteById(id);
    }
}
