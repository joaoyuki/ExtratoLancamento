/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity;

/**
 *
 * @author joao
 */
public class LancamentoContaCorrente {
    
    private Integer numeroRemessaBanco;
    private DadosDomicilioBancario dadosDomicilioBancario;

    public Integer getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Integer numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }
    
}
