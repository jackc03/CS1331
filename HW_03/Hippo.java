/**
 * Hippo subclass of Pet.
 * @author jcochran66
 * @version 1
 */
public class Hippo extends Pet {
    private int buff;

    /**
     * 3 arg constructor.
     * @param health int
     * @param attack int
     * @param buff int
     */
    public Hippo(int health, int attack, int buff) {
        super(health, attack);
        if (this.buff >= 0) {
            this.buff = buff;
        } else {
            this.buff = 0;
        }
    }

    /**
     * no arg constructor.
     */
    public Hippo() {
        this(7, 4, 2);
    }

    /**
     * Get buffed method.
     */
    public void getBuffed() {
        setHealth(getHealth() + buff);
        setAttack(getAttack() + buff);
    }

    @Override
    public void attackPet(Pet otherPet) {
        otherPet.getAttacked(getAttack());
        if (otherPet.hasFainted()) {
            getBuff();
        }
    }

    @Override
    public String toString() {
        String convert = "Hippo:" + super.toString() + "/" + String.valueOf(buff);
        return convert;
    }

    /**
     * Getter for buff int.
     * @return buff int
     */
    public int getBuff() {
        return buff;
    }
}