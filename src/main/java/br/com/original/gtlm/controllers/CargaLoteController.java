package br.com.original.gtlm.controllers;

import br.com.original.gtlm.parameters.CargaLoteRequest;
import br.com.original.gtlm.presenters.CargaLoteResponse;
import br.com.original.gtlm.utils.CargaLoteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CargaLoteController {

    @PostMapping("/carga/lote")
    ResponseEntity<CargaLoteResponse> cargaLote(@RequestBody CargaLoteRequest request){
        return ResponseEntity.ok().body(CargaLoteMapper.map(request));
    }

}
