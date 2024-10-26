/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.controller;

import pokedex.model.Tipo;

/**
 *
 * @author danie
 */
public class TipoController {
    public boolean cadastrarTipo(String nome_tipo){
        
        if(nome_tipo != null && nome_tipo.length() >0){
        
        Tipo tipo = new Tipo(nome_tipo);
        tipo.cadastrarTipo(tipo);
        return true;
    }
    return false; 
    }
}
