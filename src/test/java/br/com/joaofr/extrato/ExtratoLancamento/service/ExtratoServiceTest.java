/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.service;

import br.com.joaofr.extrato.ExtratoLancamento.DTO.ExtratoFormatadoDTO;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ControleLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.entity.DadosDomicilioBancario;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ExtratoLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.entity.LancamentoContaCorrenteCliente;
import br.com.joaofr.extrato.ExtratoLancamento.utils.JsonUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.junit.runner.RunWith;
import org.json.simple.JSONObject;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author joao
 */
@RunWith(MockitoJUnitRunner.class)
public class ExtratoServiceTest {
    
    @InjectMocks
    private ExtratoService extratoService;
    
    @Mock
    JsonUtils jsonUtils; 
    
    @Test
    public void teste(){
        assertTrue(1 < 2);
    }
    
    @Test
    public void validaCamposPreenchidosExtratoFormatado(){

        List<ExtratoFormatadoDTO> extratoFormatado = this.extratoService.retornaExtratoFormatado(retornaExtrato());
        assertTrue(extratoFormatado.get(0).getDadosBancarios().isEmpty() == false);
        assertTrue(extratoFormatado.get(0).getValorFinal().contains("R$"));
        
    }

    private ExtratoLancamento retornaExtrato() {
        
        ExtratoLancamento extrato = new ExtratoLancamento();
        extrato.setListaControleLancamento(criaListaControleLancamento());
        
        return extrato;
    }

    private List<ControleLancamento> criaListaControleLancamento() {
        
        List<ControleLancamento> lancamentos = new ArrayList<ControleLancamento>();
        ControleLancamento c1 = new ControleLancamento();
        c1.setCodigoIdentificadorUnico(1);
        c1.setDataEfetivaLancamento("01/01/2019");
        c1.setDescricaoGrupoPagamento("Regular");
        c1.setNumeroEvento(123);
        c1.setDataEfetivaLancamento("01/01/2019");
        c1.setNomeBanco("B1");
        c1.setNumeroRaizCNPJ(123);
        c1.setNumeroSufixoCNPJ(123);
        LancamentoContaCorrenteCliente lancamentoContaCorrente = new LancamentoContaCorrenteCliente();
        lancamentoContaCorrente.setNomeSituacaoRemessa("nome");
        lancamentoContaCorrente.setNumeroRemessaBanco(1L);
        lancamentoContaCorrente.setNomeTipoOperacao("tipo");
        DadosDomicilioBancario dadosDomicilio = new DadosDomicilioBancario();
        dadosDomicilio.setCodigoBanco(1);
        dadosDomicilio.setNumeroAgencia(1);
        dadosDomicilio.setNumeroContaCorrente(1);
        lancamentoContaCorrente.setDadosDomicilioBancario(dadosDomicilio);
        c1.setLancamentoContaCorrente(lancamentoContaCorrente);
        c1.setValorLancamentoRemessa(new BigDecimal("1152"));
        lancamentos.add(c1);
        
        return lancamentos;
    }
    
}
