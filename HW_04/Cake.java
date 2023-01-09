/**
 * Subclass of Dessert.
 * @author jcochran66
 * @version 1
 */
public class Cake extends Dessert {
    private String frosting;

    /**
     * 3 arg constructor.
     * @param flavor string
     * @param sweetness double
     * @param frosting string
     */
    public Cake(String flavor, double sweetness, String frosting) {
        super(flavor, sweetness);
        this.frosting = frosting;
    }

    /**
     * 1 arg constructor.
     * @param flavor string
     */
    public Cake(String flavor) {
        this(flavor, 45, "vanilla");
    }

    @Override
    public String toString() {
        return "This is a " + getFlavor() + " cake ewith a " + frosting + " frosting and has a sweetness of "
            + (Math.round(getSweetness() * 100.0) / 100.0) + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cake) {
            Cake c1 = (Cake) obj;
            return (getFlavor().equals(c1.getFlavor()) && getSweetness() == c1.getSweetness()
                && frosting.equals(c1.frosting));
        } else {
            return false;
        }
    }
}