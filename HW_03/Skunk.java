/**
 * Skunk subclass of Pet.
 * @author jcochran66
 * @version 1
 */
public class Skunk extends Pet {
    private int numSpray;

    /**
     * 3 arg constructor.
     * @param health int
     * @param attack int
     * @param numSpray int
     */
    public Skunk(int health, int attack, int numSpray) {
        super(health, attack);
        if (numSpray > 0) {
            this.numSpray = numSpray;
        } else {
            this.numSpray = 0;
        }
    }
    /**
     * No arg constructor.
     */
    public Skunk() {
        this(5, 3, 1);
    }

    /**
     * Spray pet method.
     * @param otherPet Pet
     */
    public void sprayPet(Pet otherPet) {
        if (numSpray > 0) {
            otherPet.setHealth(otherPet.getHealth() * 2 / 3);
            otherPet.setAttack(otherPet.getAttack() * 2 / 3);
        }

        numSpray--;
    }

    @Override
    public void attackPet(Pet otherPet) {
        sprayPet(otherPet);
        otherPet.getAttacked(getAttack());
    }

    @Override
    public String toString() {
        String convert = "Skunk:" + super.toString() + "/" + String.valueOf(numSpray);
        return convert;
    }

    /**
     * Getter for  numSpray.
     * @return numspray int
     */
    public int getNumSpray() {
        return numSpray;
    }
}
