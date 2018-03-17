package model.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.clases.Attack;
import model.clases.Pokemon;

public class LoadPokemon {
    
    private static int count =1;
 
    public static Pokemon loadEnemy() throws SQLException, ClassNotFoundException{
        int randomNum = count;
        count = count +1;
        if (randomNum < 6){
                ArrayList attacks = new <Attack> ArrayList();

                Pokemon pokemon = new Pokemon();
                Connection con = ConnectionBd.getConnexion();

                PreparedStatement sentencia;
                ResultSet resul;
                sentencia = con.prepareStatement("select * from masterpokemons where idPokemon=00"+randomNum+";");
                resul = sentencia.executeQuery();
                while(resul.next()){
                    pokemon.setId(resul.getString("idPokemon"));
                    pokemon.setName(resul.getString("name"));
                    pokemon.setLife(Integer.parseInt(resul.getString("life")));
                    pokemon.setAttackPoint(Integer.parseInt(resul.getString("pointAttack")));
                    pokemon.setTid("typeId");
                    pokemon.setAttack1(resul.getString("attack1"));
                    pokemon.setAttack2(resul.getString("attack2"));
                    pokemon.setAttack3(resul.getString("attack3"));
                    pokemon.setAttack4(resul.getString("attack4"));
                    attacks.add(LoadAttack.loadAttacks(pokemon.getAttack1()));
                    attacks.add(LoadAttack.loadAttacks(pokemon.getAttack2()));
                    attacks.add(LoadAttack.loadAttacks(pokemon.getAttack3()));
                    attacks.add(LoadAttack.loadAttacks(pokemon.getAttack4()));
                    pokemon.setAttacks(attacks);
                }
                
                con.close();
                return pokemon;
        }
        return null;
    }
    
    public static Pokemon loadFriend(int selected) throws SQLException, ClassNotFoundException{
        ArrayList attacks = new <Attack> ArrayList();
        
        Pokemon pokemon = new Pokemon();
        Connection con = ConnectionBd.getConnexion();
        
        PreparedStatement sentencia;
        ResultSet resul;
        sentencia = con.prepareStatement("select * from pokemons where idPokemon=00"+selected+";");
        resul = sentencia.executeQuery();
        while(resul.next()){
            pokemon.setId(resul.getString("idPokemon"));
            pokemon.setName(resul.getString("name"));
            pokemon.setLife(Integer.parseInt(resul.getString("life")));
            pokemon.setAttackPoint(Integer.parseInt(resul.getString("pointAttack")));
            pokemon.setTid("typeId");
            pokemon.setAttack1(resul.getString("attack1"));
            pokemon.setAttack2(resul.getString("attack2"));
            pokemon.setAttack3(resul.getString("attack3"));
            pokemon.setAttack4(resul.getString("attack4"));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack1()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack2()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack3()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack4()));
            pokemon.setAttacks(attacks);
        }
        
        con.close();
        return pokemon;
    }
    
   public static ArrayList <Pokemon> loadAllPokemon() throws SQLException, ClassNotFoundException{
        ArrayList attacks = new <Attack> ArrayList();
        ArrayList pokemons = new <Pokemon> ArrayList();
        Pokemon pokemon;
        
        Connection con = ConnectionBd.getConnexion();
        
        PreparedStatement sentencia;
        ResultSet resul;
        sentencia = con.prepareStatement("select * from pokemons;");
        resul = sentencia.executeQuery();
        while(resul.next()){
            pokemon = new Pokemon();
            pokemon.setId(resul.getString("idPokemon"));
            pokemon.setName(resul.getString("name"));
            pokemon.setLife(Integer.parseInt(resul.getString("life")));
            pokemon.setAttackPoint(Integer.parseInt(resul.getString("pointAttack")));
            pokemon.setTid("typeId");
            pokemon.setAttack1(resul.getString("attack1"));
            pokemon.setAttack2(resul.getString("attack2"));
            pokemon.setAttack3(resul.getString("attack3"));
            pokemon.setAttack4(resul.getString("attack4"));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack1()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack2()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack3()));
            attacks.add(LoadAttack.loadAttacks(pokemon.getAttack4()));
            pokemon.setAttacks(attacks);
            pokemons.add(pokemon);
        }
        
        con.close();
        return pokemons;
    }
        
    public static void updateState(String name, int life) throws SQLException, ClassNotFoundException{
        Connection con = ConnectionBd.getConnexion();
        
        PreparedStatement ps = con.prepareStatement("UPDATE pokemons SET life = ? WHERE name = ?");
        ps.setInt(1, life);
        ps.setString(2, name);

        ps.executeUpdate();
        ps.close();
        con.setAutoCommit(false);
        con.close();
  }
    
    public static void reset() throws SQLException, ClassNotFoundException{
        Connection con = ConnectionBd.getConnexion();
        Statement st = con.createStatement();
        st.executeUpdate("DROP TABLE pokemons;");
        st.executeUpdate("CREATE TABLE pokemons  AS (SELECT * FROM masterpokemons);");
       con.close();
    } 
 }