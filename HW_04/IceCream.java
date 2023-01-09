/**
 * Subclass of dessert.
 * @author jcochran66
 * @version 1
 */
public class IceCream extends Dessert {
    private int scoops;
    private boolean cone;

    /**
     * 4 arg constructor.
     * @param flavor string
     * @param sweetness double
     * @param scoops int
     * @param cone int
     */
    public IceCream(String flavor, double sweetness, int scoops, boolean cone) {
        super(flavor, sweetness);
        this.scoops = scoops;
        this.cone   = cone;
    }
    /**
     * 2 arg constructor.
     * @param scoops int
     * @param cone boolean
     */
    public IceCream(int scoops, boolean cone) {
        this("vanilla", 45, scoops, cone);
    }
    /**
     * No arg constructor.
     */
    public IceCream() {
        this(1, false);
    }

    @Override
    public String toString() {
        return "This is a " + getFlavor() + " ice cream with " + scoops
            + " scoops and " + (cone ? "has" : "does not have") + " a cone";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IceCream) {
            IceCream ic1 = (IceCream) obj;
            return (super.equals(obj) && this.scoops == ic1.scoops && this.cone == ic1.cone);
        } else {
            return false;
        }
    }
}
