/**
 * Companion class for Witch class.
 * @author jcochran66
 * @version 1
 */
public class BlackCat {
    private String name;
    private boolean familiar;
    
    /**
     * no args constructor.
     */
    public BlackCat(){
        this("default name", false);
    }

    /**
     * 2 args constructor.
     * @param name of black cat
     * @param familiar boolean of if black cat is a familiar
     */
    public BlackCat(String name, boolean familiar) {
        System.out.println("Black cat 2 arg");

        this.name     = name;
        this.familiar = familiar;
    }

    /**
     * action method.
     */
    public void meow() {
        if (familiar) {
            System.out.printf("%s is a familiar\n", name);
        } else if (!familiar) {
            System.out.printf("%s is not a familiar\n", name);
        }
    }

    /**
     * getter method.
     * @return name of Black Cat
     */
    public String getName() {
        return name;
    }
    /**
     * setter.
     * @param name of Black cat
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter.
     * @return boolean for if cat is familiar
     */
    public boolean getFamiliar() {
        return familiar;
    }

    /**
     * setter.
     * @param familiar boolean for if cat is a familiar
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }
}
