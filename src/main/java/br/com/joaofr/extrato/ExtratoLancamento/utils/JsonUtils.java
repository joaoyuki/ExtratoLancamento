/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofr.extrato.ExtratoLancamento.utils;

import br.com.joaofr.extrato.ExtratoLancamento.exception.ExcecaoGenerica;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

/**
 *
 * @author joao
 */
@Service
public class JsonUtils {
    
    /**
     * Método que lê um arquivo .json da pasta src/main/resources
     * @param caminho
     * @return 
     */
    public JSONObject lerJsonDeArquivo(String caminho){
        
        JSONParser parser = new JSONParser();
        JSONObject data = null;
        ClassLoader classLoader = getClass().getClassLoader();
        try{
            data = (JSONObject) parser.parse(new FileReader(classLoader.getResource(caminho).getFile()));
        }catch (IOException | ParseException e) {
            if (e instanceof IOException){
                throw new ExcecaoGenerica("Ocorreu um erro ao abrir o arquivo");
            }
            
            if (e instanceof ParseException){
                throw new ExcecaoGenerica("Ocorreu um erro ao converter o arquivo");
            }            
        }
        return data;
    }
    
}
