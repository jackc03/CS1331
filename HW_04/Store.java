import java.util.ArrayList;

/**
 * Store class.
 * @author jcochran66
 * @version 1
 */
public class Store {
    private String name;
    private ArrayList<Dessert> desserts;

    /**
     * No arg constructor.
     * @param name string
     */
    public Store(String name) {
        this.name = name;
        desserts = new ArrayList<Dessert>();
    }

    /**
     * Add dessert method.
     * @param obj dessert type
     */
    public void addDessert(Dessert obj) {
        if (obj instanceof Dessert) {
            desserts.add(obj);
        }
    }

    /**
     * Remove dessert method.
     * @param obj dessert type
     * @return dessert
     */
    public Dessert removeDessert(Dessert obj) {
        int i;
        if (obj instanceof Dessert) {
            for (i = 0; i < desserts.size(); ++i) {
                if (desserts.get(i).equals(obj)) {
                    break;
                }
            }
            if (i == desserts.size() - 1) {
                return (desserts.get(i).equals(obj) ? obj : null);
            } else {
                return obj;
            }
        } else {
            return null;
        }
    }

    /**
     * Find dessert method.
     * @param obj Dessert type
     * @return dessert
     */
    public Dessert findDessert(Dessert obj) {
        if (obj instanceof Dessert) {
            boolean present = false;
            int min, max, median;
            min = 0;
            max = desserts.size() - 1;
            median = max / 2;
            while (min <= max) {
                median = (min + max) / 2;
                System.out.print("Low is " + desserts.get(min) + "\n\n");
                System.out.print("High is " + desserts.get(max) + "\n\n");
                System.out.print("Mid is " + desserts.get(median) + "\n\n");

                if (desserts.get(median).getSweetness() == obj.getSweetness()) {
                    if (desserts.get(median).getFlavor().compareTo(obj.getFlavor()) == 0) {
                        present = true;
                        break;
                    } else if (desserts.get(median).getFlavor().compareTo(obj.getFlavor()) > 0) {
                        max = median - 1;
                    } else if (desserts.get(median).getFlavor().compareTo(obj.getFlavor()) < 0) {
                        min = median + 1;
                    }
                } else if (desserts.get(median).getSweetness() > obj.getSweetness()) {
                    max = median - 1;
                } else if (desserts.get(median).getSweetness() < obj.getSweetness()) {
                    min = median + 1;
                }
            }
            return present ? obj : null;
        } else {
            return null;
        }
    }

    /**
     * Sort store method.
     */
    public void sortStore() {
        Dessert temp;
        int minIndex;
        //int currentIndex, compareIndex;
        for (int currentIndex = 0; currentIndex < desserts.size(); ++currentIndex) {
            minIndex = currentIndex;
            for (int compareIndex = currentIndex + 1; compareIndex < desserts.size(); ++compareIndex) {
                if (desserts.get(currentIndex).compareTo(desserts.get(compareIndex)) > 0) {
                    minIndex = compareIndex;
                }
            }
            temp = desserts.get(currentIndex);
            desserts.set(currentIndex, desserts.get(minIndex));
            desserts.set(minIndex, temp);
        }
    }

    /**
     * Check Store method.
     * @param obj Dessert type
     * @return integer
     */
    public int checkStore(Dessert obj) {
        int countiee = 0;
        for (int i = 0; i < desserts.size(); ++i) {
            if (desserts.get(i).compareTo(obj) > 0) {
                ++countiee;
            }
        }
        return countiee;
    }

    /**
     * Getter for desserts.
     * @return arraylist
     */
    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }
}