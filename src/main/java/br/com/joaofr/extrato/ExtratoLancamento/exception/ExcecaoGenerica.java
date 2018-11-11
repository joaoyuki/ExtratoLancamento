/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.exception;

import org.springframework.http.HttpStatus;

/**
 *
 * @author joao
 */
public class ExcecaoGenerica extends RuntimeException{
    
    private String mensagemErro;
    private Exception exception;
    private HttpStatus httpStatus;    

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

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
    
    
    
}
