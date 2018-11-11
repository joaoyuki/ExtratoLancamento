/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity.controller;

import br.com.joaofr.extrato.ExtratoLancamento.DTO.ExtratoFormatadoDTO;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ExtratoLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.service.ExtratoService;
import br.com.joaofr.extrato.ExtratoLancamento.utils.JsonUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joao
 */

@RestController
@RequestMapping("/extrato")
@CrossOrigin
public class ExtratoController {
    
    @Autowired
    private ExtratoService extratoService;
    
    @GetMapping("/")
    @ApiOperation(value = "Retorna dados recuperados de arquivo", response = ExtratoLancamento.class)
    public ResponseEntity<ExtratoLancamento> recupeDados(){
        
        ExtratoLancamento extrato = extratoService.retornaExtrato();
        
        return ResponseEntity.ok(extrato);
    }
    
    @GetMapping("/formatado")
    @ApiOperation(value = "Retorna dados formatados de arquivo", response = ExtratoLancamento[].class)
    public ResponseEntity recupeDadosFormatados(){
        
        ExtratoLancamento extrato = extratoService.retornaExtrato();
        List<ExtratoFormatadoDTO> extratoFormatado = extratoService.retornaExtratoFormatado(extrato);
        
        return ResponseEntity.ok(extratoFormatado);
    }    
    
}
