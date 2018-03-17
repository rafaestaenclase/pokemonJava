package model.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.clases.Attack;
import model.clases.Pokemon;

public class LoadAttack {
         public static Attack loadAttacks(String attackId) throws SQLException, ClassNotFoundException{
        
         Attack attack = new Attack();
        Connection con = ConnectionBd.getConnexion();
        
        PreparedStatement sentencia;
        ResultSet resul;
        sentencia = con.prepareStatement("select * from attacklist where idAttack="+attackId+";");
        resul = sentencia.executeQuery();
        while(resul.next()){
                    attack.setId(resul.getString("idAttack"));
                    attack.setName(resul.getString("name"));
                    attack.setDamage(Integer.parseInt(resul.getString("damageBase")));
                    attack.setAttackPoint(Integer.parseInt(resul.getString("pointAttack")));
                }
        
        con.close();
        return attack;
    }
    
    public static int loadFriendAttack(String attackName) throws SQLException, ClassNotFoundException{
        int hurt = 0;
        
        Pokemon pokemon = new Pokemon();
        Connection con = ConnectionBd.getConnexion();
        
        PreparedStatement sentencia;
        ResultSet resul;
        sentencia = con.prepareStatement("select * from attacklist where name='"+attackName+"';");
        resul = sentencia.executeQuery();
        while(resul.next()){
            hurt = resul.getInt("damageBase");
        }
        
        con.close();
        return hurt;
    }
}
