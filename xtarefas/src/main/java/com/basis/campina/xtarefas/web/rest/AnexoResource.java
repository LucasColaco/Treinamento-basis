package com.basis.campina.xtarefas.web.rest;

import com.basis.campina.xtarefas.servico.AnexoService;
import com.basis.campina.xtarefas.servico.dto.DocumentoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anexos")
@RequiredArgsConstructor
public class AnexoResource {

    private final AnexoService anexoService;


    @GetMapping("/documento/{uuId}")
    public ResponseEntity<DocumentoDTO> obterDocumento(@PathVariable String uuId) {
        return ResponseEntity.ok(anexoService.obterDocumento(uuId));
    }

}
