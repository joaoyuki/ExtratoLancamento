/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.DTO;

import java.util.Date;

/**
 * DTO com os campos que serão exibidos no front-end
 * @author joao
 */
public class ExtratoFormatadoDTO {
    
    private String dataLancamento;
    private String descricao;
    private Long numero;
    private String situacao;
    private String dataConfirmacao;
    private String dadosBancarios;
    private String valorFinal;

    public ExtratoFormatadoDTO(String dataLancamento, String descricao, Long numero, String situacao, String dataConfirmacao, String dadosBancarios, String valorFinal) {
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.numero = numero;
        this.situacao = situacao;
        this.dataConfirmacao = dataConfirmacao;
        this.dadosBancarios = dadosBancarios;
        this.valorFinal = valorFinal;
    }

    public ExtratoFormatadoDTO() {
        //Construtor padrão
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(String dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public String getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public String getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }
    
}
