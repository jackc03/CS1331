public class HouseHunting {
    public static void main(String[] args){
        House[] houses = new House[10];
        for(int i = 0; i < 5; ++i){
            houses[i] = new House("cum lane",5000, 6.5, true);
        }
        for(int i = 5; i < 10; ++i){
            houses[i] = new House();
        }
        Neighborhood n1 = new Neighborhood(houses);

        n1.displayNewHouses(1555);

        System.out.println("\n\nNow removing house #5\n\n");

        n1.removeHouse(4);

        House swappyHouse = new House("poop avenue", 1978, 5.0, false);
        n1.addHouse(6, swappyHouse);

        n1.displayNewHouses(1000);

        boolean isitfuckingtrue = n1.isFull();

        System.out.println("\nNeighborhood 1 is full?(T/F): " + isitfuckingtrue);

        n1.addHouse(4, swappyHouse);

        isitfuckingtrue = n1.isFull();

        n1.displayNewHouses(1000);
        System.out.println("\nNeighborhood 1 is full?(T/F): " + isitfuckingtrue);
        

    }
}