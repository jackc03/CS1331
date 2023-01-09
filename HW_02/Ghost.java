/**
 * Type of trick or treater.
 * @author jcochran66
 * @version 1
 */
public class Ghost extends TrickOrTreater {
    private int transparency;
    /**
     * 4 arg constructor for ghost.
     * @param name of ghost
     * @param neighborhood of ghost
     * @param numCandy of ghost
     * @param transparency of ghost
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        System.out.println("Ghost 4 arg");

        this.name         = name;
        this.neighborhood = neighborhood;
        this.numCandy     = numCandy;
        this.transparency = transparency;
        totalCandy       += numCandy;
    }
    /**
     * 1 arg constructor for Ghost.
     * @param transparency of ghost
     */
    public Ghost(int transparency) {
        System.out.println("Ghost 1 arg");
        this.transparency = transparency;
    }
    /**
     * Copy constructor of GHost.
     * @param g1 ghost to make deep copy of
     * 
     */
    public Ghost(Ghost g1) {
        System.out.println("Ghost deep copy");

        if (g1 != null) {
            this.name         = g1.getName();
            this.neighborhood = g1.getNeighborhood();
            this.numCandy     = g1.getNumCandy();
            totalCandy       +=  g1.getNumCandy();
            this.transparency = g1.getTransparency();
        }
    }
    /**
     * Spook action.
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very spooky");
        } else if (3 <= transparency && transparency <= 9) {
            System.out.println("Boo!");
        } else if (transparency <= 2) {
            System.out.println("Not very spooky");
        }
    }


    /**
     * Getter for transparency.
     * @return transparency
     */
    public int getTransparency() {
        return transparency;
    }
    /**
     * Setter for transparency.
     * @param transparency to set to
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}

