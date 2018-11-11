/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.json.simple.JSONObject;

/**
 *
 * @author joao
 */
public class LancamentoContaCorrenteCliente {
    
    private Long numeroRemessaBanco;
    private String nomeSituacaoRemessa;
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;
    
    public static LancamentoContaCorrenteCliente converteJsonParaObjeto(JSONObject data) throws JsonSyntaxException{
        
        LancamentoContaCorrenteCliente conta = new Gson().fromJson(data.toJSONString(), LancamentoContaCorrenteCliente.class);
        
        return conta;
    }    

    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public LancamentoContaCorrenteCliente() {
        //Construtor padrao
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public LancamentoContaCorrenteCliente(Long numeroRemessaBanco, String nomeSituacaoRemessa, DadosDomicilioBancario dadosDomicilioBancario, String nomeTipoOperacao) {
        this.numeroRemessaBanco = numeroRemessaBanco;
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
        this.dadosDomicilioBancario = dadosDomicilioBancario;
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    
    
    
    
}
