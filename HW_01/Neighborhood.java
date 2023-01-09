public class Neighborhood {
    private int numHouses;
    private House[] houses = {null};


    public Neighborhood(House[] houses) {
        this.houses = houses;
        numHouses   = 0;
        for (int i = 0; i < houses.length; ++i){
            if(this.houses[i] != null){
                ++numHouses;
            }
        }
    }
    public Neighborhood() {
        this(new House[5]);
    }


    public void displayNewHouses(int yearMin) {
        for (int i = 0; i < this.houses.length; ++i) {
            if (houses[i] != null && houses[i].getYearBuilt() > yearMin) {
                System.out.printf("House located at %s was built in %d, has %f and %s been renovated recently.\n", houses[i].getAddress(), houses[i].getYearBuilt(), houses[i].getNumBaths(), houses[i].isRenovatedBoolean() ? "has" : "has not");
            } else if (houses[i] == null) {
                System.out.println("House #" + i + " is non existent");
            }

        }
    }


    public House addHouse(int swapIndex, House swapHouse) {
        House temphouse   = houses[swapIndex];
        houses[swapIndex] = swapHouse;
        if (swapIndex < 0 || swapIndex >= houses.length) {
            return null;
        } else if (temphouse == null) {
            ++numHouses;
            return null;
        } else {
            return temphouse;
        }
    }

    public House removeHouse(int removeIndex) {
        if (houses[removeIndex] == null) {
            return null;
        } else {
            House removeHouse = houses[removeIndex];
            houses[removeIndex] = null;
            return removeHouse;
        }
    }

    public boolean isFull() {
        int occupiedhouses = 0;
        for (int i = 0; i < houses.length; ++i) {
            if (houses[i] != null) {
                System.out.println("House #" + i + " exists");
                ++occupiedhouses;
            } else {
                System.out.println("House #" + i + " does not exist");

            }
        }
        return ((occupiedhouses == houses.length) ? true : false);
    }

}
