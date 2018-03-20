package pokemon;

import GUI.*;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bd.*;
import model.clases.*;

public class main {

    private static CombatWindow cw;
    private static int friendAnimate;
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Launcher().setVisible(true);
    }
    
    public static void combatWindowOn(){
        cw = new CombatWindow();
        cw.setVisible(true);
    }
    
    public static Pokemon loadEnemy() throws SQLException, ClassNotFoundException{
        
        Pokemon pokemon = LoadPokemon.loadEnemy();
        return pokemon;
        
    }
    
        public static Pokemon loadFriend(int selected) throws SQLException, ClassNotFoundException{
        
        Pokemon pokemon = LoadPokemon.loadFriend(selected);
        return pokemon;
        
    }
    
    public static ArrayList <Pokemon> loadAllPokemon() throws SQLException, ClassNotFoundException{
        ArrayList pokemons = LoadPokemon.loadAllPokemon();
        return pokemons;
        
    }
    
    public static void animationTime(int friend){
        new CounterAnimation().start();
        friendAnimate =friend;
    }
    
    public static void animationTimeTest(int seconds){
            cw.endAnimation(seconds, friendAnimate);
    }
    
}
