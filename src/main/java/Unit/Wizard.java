package Unit;

public class Wizard extends Magician{
    @Override
    public void conjure() {
        System.out.println("Lumos");
    }

    public Wizard(String name, int health, int attack) {
        super(name, health, attack);
    }
}
