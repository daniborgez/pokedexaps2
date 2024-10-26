/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.model;
//NESSA CLASE ELE ACHOU A CLASSE POKEMON FACIL

/**
 *
 * @author danie
 */
public class Tipo {
    
    private Integer id_tipo; 
    private String nome_tipo;
    private Pokemon pokemon;
    
    public Tipo(){} 
    
    public Tipo(Integer id_Pokemon,String nome_tipo){
        this.nome_tipo = nome_tipo;
        Pokemon pokemon = new Pokemon();
        pokemon.setId_pokemon(id_Pokemon);
        this.pokemon = pokemon;   
    }

    public Integer getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void cadastrarTipo(Habilidade habilidade)  {
       
    }
            
    
}
