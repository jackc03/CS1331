/**
 * Turtle, Subclass of Pet.
 * @author jcohran66
 * @version 1
 */
public class Turtle extends Pet {
    private boolean melonArmor;



    /**
     * 3 arg constructor.
     * @param health health of turtle
     * @param attack attack value of turtle
     * @param melonArmor boolean
     */
    public Turtle(int health, int attack, boolean melonArmor) {
        super(health, attack);
        this.melonArmor = melonArmor;
    }
    /**
     * no arg constructor.
     */
    public Turtle() {
        this(4, 2, true);
    }
    @Override
    public void getAttacked(int attack) {
        if (melonArmor) {
            attack -= 20;
            melonArmor = false;
            super.getAttacked(attack);
        } else {
            super.getAttacked(attack);
        }
    }

    @Override
    public String toString() {
        String convert = "Turtle:" + super.toString() + "/" + (melonArmor ? "true" : "false");
        return convert;
    }

    /**
     * Getter for melonArmor.
     * @return melonArmor boolean
     */
    public boolean getMelonArmor() {
        return melonArmor;
    }
}
