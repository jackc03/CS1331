/**
 * Dessert superclass.
 * @author jcochran66
 * @version 1
 */
public abstract class Dessert implements Comparable<Dessert> {
    private String flavor;
    private double sweetness;

    /**
     * 2 arg constructor.
     * @param flavor string
     * @param sweetness double
     */
    public Dessert(String flavor, double sweetness) {
        this.flavor = flavor;
        this.sweetness = sweetness;
    }
    /**
     * No arg constructor.
     */
    public Dessert() {
        this("vanilla", 25.0);
    }

    @Override
    public String toString() {
        return "This is a " + flavor + " dessert with a sweetness of "
             + (Math.round(sweetness * 100.0) / 100.0) + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dessert) {
            Dessert d1 = (Dessert) obj;
            return (flavor.equals(d1.flavor) && sweetness == d1.sweetness);
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Dessert d) {
        if (this.sweetness == d.sweetness) {
            return this.flavor.compareTo(d.flavor);
        } else {
            return this.sweetness > d.sweetness ? 1 : -1;
        }
    }

    /**
     * Getter for flavor.
     * @return flavor string
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Getter for sweetness.
     * @return sweetness double
     */
    public double getSweetness() {
        return sweetness;
    }

}