package model.clases;

import java.util.ArrayList;

public class Pokemon {
    private String id;
    private String name;
    private String tid;
    private ArrayList attacks;
    private int life;
    private int attackPoint;
    private String attack1;
    private String attack2;
    private String attack3;
    private String attack4;



    public Pokemon() {
    }

    public Pokemon(String id, String name, String tid, ArrayList attacks, int life, int attackPoint, String attack1, String attack2, String attack3, String attack4) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.attacks = new <Attack> ArrayList();
        this.life = life;
        this.attackPoint = attackPoint;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public ArrayList getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList attacks) {
        this.attacks = attacks;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getAttack1() {
        return attack1;
    }

    public void setAttack1(String attack1) {
        this.attack1 = attack1;
    }

    public String getAttack2() {
        return attack2;
    }

    public void setAttack2(String attack2) {
        this.attack2 = attack2;
    }

    public String getAttack3() {
        return attack3;
    }

    public void setAttack3(String attack3) {
        this.attack3 = attack3;
    }

    public String getAttack4() {
        return attack4;
    }

    public void setAttack4(String attack4) {
        this.attack4 = attack4;
    }

    
    
    
    
    
}
