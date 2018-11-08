/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import org.json.simple.JSONObject;

/**
 *
 * @author joao
 */
public class ExtratoLancamento {
    
    private TotalControle totalControleLancamento;
    private List<ControleLancamento> listaControleLancamento;
    private Integer tamanhoPagina;
    private Integer indice;
    
    public static ExtratoLancamento converteJsonParaObjeto(JSONObject data) throws JsonSyntaxException{
        
        ExtratoLancamento extrato = new Gson().fromJson(data.toJSONString(), ExtratoLancamento.class);
        
        return extrato;
    }    

    public TotalControle getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControle totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
}
