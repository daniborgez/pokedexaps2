/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.controller;

import pokedex.model.Habilidade;


/**
 *
 * @author danie
 */
public class HabilidadeController {
    public boolean cadastrarHabilidade(String nome_habilidade, String descricao ){
        
        if(nome_habilidade != null && nome_habilidade.length() >0 && descricao != null && descricao.length() >0){
        
        Habilidade habilidade = new Habilidade(nome_habilidade,descricao);
        habilidade.cadastrarHabilidade(habilidade);
        return true;
    }
    return false; 
    }
}
