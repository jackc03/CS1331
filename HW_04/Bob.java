import java.util.ArrayList;
/**
 * Bob class.
 * @author jcochran66
 * @version 1
 */
public class Bob {
    /**
     * compareStores method to compare store s1 and s2.
     * @param s1 store original
     * @param s2 store compared
     * @return boolean whether stores are equal
     */
    public static boolean compareStores(Store s1, Store s2) {
        ArrayList<Dessert> desserts1 = s1.getDesserts();
        ArrayList<Dessert> desserts2 = s2.getDesserts();

        for (int i = 0; i < desserts1.size(); ++i) {
            if (desserts1.get(i).compareTo(desserts2.get(i)) != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * shop shops for the dessert bob wants.
     * @param s1 store being analyzed
     * @param d1 dessert being searched for
     * @return boolean of whether the dessert is found
     */
    public static boolean shop(Store s1, Dessert d1) {
        s1.sortStore();
        if (s1.findDessert(d1) != null) {
            return true;
        }
        return false;
    }
}