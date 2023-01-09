import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    public static void main(String[] args) {
        //List is a built in ADT to Java
        // we don't actually care what kind of list 
        List<Animal> myAnimals = new ArrayList<>();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimals.add(myDog);
        myAnimals.add(myCat);

        // We don't care what kind of Animal it is,
        // only that we can call the Animal methods to...
        // make the Animal move
        // make the Animal make noise
        // print out the color
        for(Animal myAnimal : myAnimals) {
            myAnimal.move();
            myAnimal.makeNoise();
            myAnimal.getColor();
        }
    }
}
