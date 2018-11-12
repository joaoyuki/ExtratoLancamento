/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.service;

import br.com.joaofr.extrato.ExtratoLancamento.DTO.ExtratoFormatadoDTO;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ControleLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ExtratoLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.utils.JsonUtils;
import com.google.gson.JsonSyntaxException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
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
        
        ExtratoLancamento extrato = criaExtratoLancamento();
        
        return extrato;
    }

    public ExtratoLancamento criaExtratoLancamento() throws JsonSyntaxException {
        
        JSONObject data = jsonUtils.lerJsonDeArquivo("lancamento-conta-legado.json");
        ExtratoLancamento extrato = ExtratoLancamento.converteJsonParaObjeto(data);
        return extrato;
        
    }

    /**
     * Método que formata a saída dos dados
     * @param extratoLancamento
     * @return 
     */
    public List<ExtratoFormatadoDTO> retornaExtratoFormatado(ExtratoLancamento extratoLancamento) {
        
        List<ExtratoFormatadoDTO> extratosFormatados = new ArrayList<ExtratoFormatadoDTO>();
        for(ControleLancamento lancamento : extratoLancamento.getListaControleLancamento()){
            ExtratoFormatadoDTO extrato = new ExtratoFormatadoDTO();
            extrato.setDadosBancarios(lancamento.getNomeBanco() + " Ag " + lancamento.getLancamentoContaCorrente().getDadosDomicilioBancario().getNumeroAgencia() + " CC " + lancamento.getLancamentoContaCorrente().getDadosDomicilioBancario().getNumeroContaCorrente());
            extrato.setDataLancamento(lancamento.getDataLancamentoContaCorrenteCliente());
            extrato.setDescricao(lancamento.getLancamentoContaCorrente().getNomeTipoOperacao());
            extrato.setSituacao(lancamento.getLancamentoContaCorrente().getNomeSituacaoRemessa());
            extrato.setNumero(lancamento.getLancamentoContaCorrente().getNumeroRemessaBanco());
            extrato.setDataConfirmacao(lancamento.getDataEfetivaLancamento());
            extrato.setValorFinal("R$ " + recuperaValorBigDecimal(lancamento.getValorLancamentoRemessa()));
            extratosFormatados.add(extrato);
        }
        
        
        return extratosFormatados;
    }
    
    /**
     * Método que recebe um BigDecimal e retorna o valor formatado para real.
     * @param bigDecimal
     * @return 
     */
    public String recuperaValorBigDecimal(BigDecimal bigDecimal){
          DecimalFormat decFormat = new DecimalFormat("#,###,##0.00");
          return decFormat.format(bigDecimal);
    }    

}
