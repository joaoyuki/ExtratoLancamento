/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.utils;

import br.com.joaofr.extrato.ExtratoLancamento.entity.ControleLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.entity.ExtratoLancamento;
import br.com.joaofr.extrato.ExtratoLancamento.exception.ExcecaoGenerica;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.junit.runner.RunWith;
import org.json.simple.JSONObject;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;



/**
 *
 * @author joao
 */

@RunWith(MockitoJUnitRunner.class)
public class JsonUtilTest {
    
    @InjectMocks
    @Spy
    private JsonUtils jsonUtils;
    
    @Test
    public void deveRetornarObjetoJsonComCaminhoCerto(){
        JSONObject objetoJson = jsonUtils.lerJsonDeArquivo("lancamento-conta-legado.json");
        assertNotNull(objetoJson);
    }   
    
    @Test(expected = ExcecaoGenerica.class)
    public void deveRetornarExceocaoGenericaSeNaoConseguirAbrirArquivo(){
        
        JSONObject objetoJson = jsonUtils.lerJsonDeArquivo("");
    }   

    @Test(expected = ExcecaoGenerica.class)
    public void deveRetornarExceocaoGenericaSeNaoConseguirConverterArquivo(){
        
        Mockito.doThrow(ExcecaoGenerica.class).when(jsonUtils).lerJsonDeArquivo(ArgumentMatchers.anyString());
        JSONObject objetoJson = jsonUtils.lerJsonDeArquivo("");
    }  
    
    
    @Test
    public void teste(){
        
        JSONObject data = jsonUtils.lerJsonDeArquivo("lancamento-conta-legado.json");
        String json = data.toJSONString();  
        System.out.println(json);
        System.out.println(System.currentTimeMillis());
        ExtratoLancamento a = ExtratoLancamento.converteJsonParaObjeto(data);
        System.out.println(a);
        
    }
    
}
