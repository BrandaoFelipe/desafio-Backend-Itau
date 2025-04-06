package com.brandaodev.desafio_backend_itau.services;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.brandaodev.desafio_backend_itau.dtos.TransacaoDTO;

@Service
public class TransacaoService {

    private final Map<OffsetDateTime, TransacaoDTO>persist = new HashMap<>();

    public boolean processaTransacao(TransacaoDTO dto){
        
        if(dto.getDataHora().isAfter(OffsetDateTime.now())){
            throw new IllegalArgumentException("A transação NÃO DEVE acontecer no futuro");
            
        }
        
        if(dto.getValor() < 0){
            throw new IllegalArgumentException("A transação DEVE ter valor igual ou maior que 0 (zero)");
        }

        persist.put(OffsetDateTime.now(), dto);

        return true;
    }  
}
