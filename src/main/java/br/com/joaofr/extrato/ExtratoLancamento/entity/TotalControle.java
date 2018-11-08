/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity;

import java.math.BigDecimal;

/**
 *
 * @author joao
 */
public class TotalControle {
    
    private BigDecimal valorLancamentos;
    private Integer quantidadeRemessas;
    private Integer quantidadeLancamentos;

    public BigDecimal getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(BigDecimal valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

    public Integer getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(Integer quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public Integer getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }
    
}
