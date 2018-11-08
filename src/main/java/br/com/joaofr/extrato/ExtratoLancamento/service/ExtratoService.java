/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.service;

import br.com.joaofr.extrato.ExtratoLancamento.entity.ExtratoLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.utils.JsonUtils;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joao
 */
@Service
public class ExtratoService {
    
    @Autowired
    JsonUtils jsonUtils;    
    
    public ExtratoLancamento retornaExtrato(){
        
        JSONObject data = jsonUtils.lerJsonDeArquivo("lancamento-conta-legado.json");
        ExtratoLancamento extrato = ExtratoLancamento.converteJsonParaObjeto(data);
        
        return extrato;
    }
    
}
