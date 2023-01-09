/**
 * Pet parent class.
 * @author Jcochr66
 * @version 1
 */
public abstract class Pet implements Comparable<Pet> {
    private int health;
    private int attack;

    /**
     * 2 arg constructor.
     * @param health int
     * @param attack int
     */
    public Pet(int health, int attack) {
        if (health >= 0) {
            this.health = health;
        } else {
            this.health = 1;
        }

        if (attack > 0) {
            this.attack = attack;
        } else {
            this.attack = 0;
        }
    }

    /**
     * Method to check if pet has fainted.
     * @return if the pet has fainted
     */
    public boolean hasFainted() {
        return this.health <= 0;
    }

    /**
     * Get attacked method.
     * @param attacked int
     */
    public void getAttacked(int attacked) {
        if (attacked >= 0) {
            this.health -= attacked;
        }
    }
    /**
     * attack other pet method.
     * @param otherPet Pet
     */
    public void attackPet(Pet otherPet) {
        otherPet.getAttacked(attack);
    }

    @Override
    public String toString() {
        String convert = String.valueOf(attack) + "/" + String.valueOf(health);
        return convert;
    }

    @Override
    public int compareTo(Pet otherPet) {
        if (otherPet != null) {
            if (this.attack + this.health < otherPet.attack + otherPet.health) { // This less than other, return -1
                return -1;
            } else if (this.attack + this.health > otherPet.attack + otherPet.health) { // This greater than other, return 1
                return 1;
            }   else {
                return 0;
            } //Equal, return 0
        } else {
            return -25;
        }
    }

    /**
     * Getter for Pet Health.
     * @return health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Getter for Pet attack.
     * @return attack value
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Setter for health
     * @param health new value for health
     */
    protected void setHealth(int health) {
        this.health = health;
    }

    /**
     * Setter for attack
     * @param attack new value for attack
     */
    protected void setAttack(int attack) {
        this.attack = attack;
    }

}