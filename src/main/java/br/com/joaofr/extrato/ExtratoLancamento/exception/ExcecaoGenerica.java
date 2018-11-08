/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.exception;

/**
 *
 * @author joao
 */
public class ExcecaoGenerica extends RuntimeException{
    
    private String mensagemErro;

    public ExcecaoGenerica(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public ExcecaoGenerica() {
    }    
    
    public String getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }    
    
}
