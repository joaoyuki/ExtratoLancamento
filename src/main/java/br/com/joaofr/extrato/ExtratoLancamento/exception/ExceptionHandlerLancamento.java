/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.exception;

import java.time.Instant;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author joao
 */
@ControllerAdvice
public class ExceptionHandlerLancamento extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler(ExcecaoGenerica.class)
    public ResponseEntity<Erro> handleCustomException(ExcecaoGenerica ex) {
        
        Erro apiError = null;
        apiError = new Erro(new Date(), ex.getMensagemErro(), ex.getLocalizedMessage(), ex.getHttpStatus());
        
        return new ResponseEntity<Erro>(apiError, new HttpHeaders(), ex.getHttpStatus());
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Erro> handleException(Exception e){

        Erro apiError = null;
        apiError = new Erro(new Date(), "Ocorreu um erro inexperado. Por favor contate o administrador do sistema", e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        
        return new ResponseEntity<Erro>(apiError, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        
    }
    
}
