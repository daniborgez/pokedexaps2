/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.model;


/**
 *
 * @author danie
 */
public class Habilidade {
    private Integer id_hablidade; 
    private String nome_hablidade;
    private String descricao; 
    private Pokemon pokemon; 
    
    public Habilidade(){}
    
    public Habilidade(Integer id_pokemon, String nome_habilidade, String descricao){
        this.nome_hablidade = nome_habilidade;
        this.descricao = descricao ;
        Pokemon pokemon = new Pokemon(); //nao acha a classe pokemon
        pokemon.setId_pokemon(id_pokemon);
        this.pokemon = pokemon;
    } 

    public Integer getId_hablidade() {
        return id_hablidade;
    }

    public void setId_hablidade(Integer id_hablidade) {
        this.id_hablidade = id_hablidade;
    }

    public String getNome_hablidade() {
        return nome_hablidade;
    }

    public void setNome_hablidade(String nome_hablidade) {
        this.nome_hablidade = nome_hablidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void cadastrarHabilidade(Habilidade habilidade) throws ExceptionDAO {
        new HabilidadeDAO().cadastrarHabilidade(habilidade); //ainda nao fiz essa classe
    }
    
}
