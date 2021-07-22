package com.basis.campina.xtarefas.servico.feign;


import com.basis.campina.xtarefas.servico.dto.DocumentoDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "xdocs",url = "${application.feign.url-documents}")
public interface DocumentClient {

    @PostMapping("/api/documentos")
    ResponseEntity<Void> salvar(List<DocumentoDTO> documentoDTOS);

    @GetMapping("/api/documentos/{uuId}")
    ResponseEntity<DocumentoDTO> obterDocumento(@PathVariable("uuId") String uuId);

}
