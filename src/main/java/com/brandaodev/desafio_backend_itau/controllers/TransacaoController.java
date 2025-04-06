package com.brandaodev.desafio_backend_itau.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandaodev.desafio_backend_itau.dtos.TransacaoDTO;
import com.brandaodev.desafio_backend_itau.services.TransacaoService;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @PostMapping
    public ResponseEntity<?>transacao(@RequestBody TransacaoDTO dto){
        
        if(!service.processaTransacao(dto)){
            return ResponseEntity.unprocessableEntity().body(null);
        }

        return ResponseEntity.ok(null);
    }
}
