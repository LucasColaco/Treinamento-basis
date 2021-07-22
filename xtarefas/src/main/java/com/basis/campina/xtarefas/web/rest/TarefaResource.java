package com.basis.campina.xtarefas.web.rest;

import com.basis.campina.xtarefas.servico.TarefaService;
import com.basis.campina.xtarefas.servico.dto.ResponsavelDTO;
import com.basis.campina.xtarefas.servico.dto.TarefaDTO;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public ResponseEntity<TarefaDTO> salvar(@RequestBody TarefaDTO tarefaDTO) throws URISyntaxException {
        TarefaDTO dto = tarefaService.salvar(tarefaDTO);
        return ResponseEntity.created(new URI("/api/tarefas/")).body(dto);
    }





}
