/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.json.simple.JSONObject;

/**
 *
 * @author joao
 */
public class ControleLancamento {
    
    private Long dateLancamentoContaCorrenteCliente;
    private Integer numeroSufixoCNPJ;
    private Integer quantidadeLancamentoRemessa;
    private Integer numeroRaizCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private String dataLancamentoContaCorrenteCliente;
    private String dataEfetivaLancamento;
    private Integer numeroEvento;
    private String nomeBanco;
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    private String descricaoGrupoPagamento;
    private Integer codigoIdentificadorUnico;
    private Long dateEfetivaLancamento;
    
    public static ControleLancamento converteJsonParaObjeto(JSONObject data) throws JsonSyntaxException{
        
        ControleLancamento lancamento = new Gson().fromJson(data.toJSONString(), ControleLancamento.class);
        
        return lancamento;
    }

    public Long getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Integer getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(Integer numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public Integer getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(Integer numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public BigDecimal getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public Integer getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public LancamentoContaCorrenteCliente getLancamentoContaCorrente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrente(LancamentoContaCorrenteCliente lancamentoContaCorrente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrente;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public Integer getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(Integer codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public Long getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }
    
}
