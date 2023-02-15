package Unit;

public class Human {
    protected String name;
    protected int health;
    protected int attack;



    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }





    public Human(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;


    }
}
