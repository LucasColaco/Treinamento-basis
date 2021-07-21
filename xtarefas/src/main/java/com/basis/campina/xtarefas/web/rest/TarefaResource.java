package com.basis.campina.xtarefas.web.rest;

import com.basis.campina.xtarefas.servico.TarefaService;
import com.basis.campina.xtarefas.servico.dto.TarefaDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tarefas")
public class TarefaResource {

    private final TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<TarefaDTO>> buscar(){
        return ResponseEntity.ok(tarefaService.buscar());
    }



}
