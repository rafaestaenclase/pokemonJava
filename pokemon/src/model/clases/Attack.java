package model.clases;

public class Attack {
    private String id;
    private String name;
    private int attackPoint;
    private int damage;

    public Attack() {
    }
    
    

    public Attack(String id, String name, int attackPoint, int damage) {
        this.id = id;
        this.name = name;
        this.attackPoint = attackPoint;
        this.damage = damage;
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

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
}
