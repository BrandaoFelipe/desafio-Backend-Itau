package com.brandaodev.desafio_backend_itau.dtos;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotBlank;


public class TransacaoDTO {

    
    @NotBlank(message = "digite um valor")
    private Double valor;


    @NotBlank(message = "digite um valor")
    private OffsetDateTime dataHora;
    
    public TransacaoDTO() {
    }

    public TransacaoDTO(Double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    

    
}
