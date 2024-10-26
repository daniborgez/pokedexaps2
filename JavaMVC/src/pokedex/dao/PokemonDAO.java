/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pokedex.model.Pokemon; 
/**
 *
 * @author danie
 */
public class PokemonDAO {
    
    public void cadastrarPokemon(Pokemon pokemon) throws ExceptionDAO{
        String sql = "insert into pokemon.mvc (nome,categoria,descricao,habitat,cor ) value (?,?,?,?,?)";
        PreparedStatement pStatement = null; 
        Connection connection = null; 
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, pokemon.getNome());
            pStatement.setString(2, pokemon.getCategoria());
            pStatement.setString(3, pokemon.getDescricao());
            pStatement.setString(4, pokemon.getHabitat());
            pStatement.setString(5, pokemon.getCor());
            pStatement.execute();
        }catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o pokemon: "+ e);
        }finally{
            
            try{
                if(pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            } try {
                if(connection != null) {connection.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fehcar a conexão; "+ e);
            }
            
        }
        
    }
    
}
