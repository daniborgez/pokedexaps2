/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.controller;

import pokedex.model.Pokemon;

/**
 *
 * @author danie
 */
public class PokemonController {
    
    public boolean cadastrarPokemon(String nome, String categoria, String descricao, String habitat, String cor){
        
        if(nome != null && nome.length() >0 && categoria != null && categoria.length() >0 && descricao != null && descricao.length() >0 && habitat != null && habitat.length() >0 && cor != null && cor.length() >0){
        
        Pokemon pokemon = new Pokemon(nome,categoria,descricao,habitat,cor);
        pokemon.cadastrarPokemon(pokemon);
        return true;
    }
    return false; 
    }
}
