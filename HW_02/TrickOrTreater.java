/** 
 * parent class.
 * @author jcochran66
 * @version 1
 */
public class TrickOrTreater {
    protected String name;
    protected String neighborhood;
    protected      int numCandy;
    protected static int totalCandy;

    /**
     * 3 arg constructor.
     * @param name of trick or treater
     * @param neighborhood of trick or treater
     * @param numCandy of trick or treater
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        System.out.println("Trick treater 4 arg");
        this.name         = name;
        this.neighborhood = neighborhood;
        this.numCandy     = numCandy;
        totalCandy       += numCandy;
    }

    /**
     * no arg constructor.
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
        System.out.println("Trick treater 1 arg");
    }

    /**
     * Seek candy action.
     * @param luck of trick or treater
     */
    public void seekCandy(int luck) {
        int addCandy = 3 * luck;
        numCandy    += addCandy;
        totalCandy  += addCandy;
    }

    /**
     * Getter for name.
     * @return name of trick or treater
     */
    public String getName() {
        return name;
    }
    /**
     * Setter for name.
     * @param name for setiing
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for neighborhood.
     * @return neighborhood name
     */
    public String getNeighborhood() {
        return neighborhood;
    }
    /**
     * Setter for neighborhood.
     * @param neighborhood string name of neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Getter for numcandy.
     * @return numcandy
     */
    public int getNumCandy() {
        return numCandy;
    }
    /**
     * Setter for numcandy.
     * @param numCandy int
     */
    public void setNumCandy(int numCandy) {
        if (numCandy >= this.numCandy) {
            totalCandy   += (numCandy - this.numCandy);
            this.numCandy = numCandy;
        }
    }
    /**
     * Getter for static int totalcandy.
     * @return static totalcandy
     */
    public static int getTotalCandy() {
        return totalCandy;
    }
    /**
     * Setter for totalcandy.
     * @param newTotalCandy static int
     */
    public static void setTotalCandy(int newTotalCandy) {
        if (newTotalCandy >= totalCandy) {
            totalCandy = newTotalCandy;
        }
    }
}