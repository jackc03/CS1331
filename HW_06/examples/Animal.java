
public interface Animal {
    public void makeNoise();
    public String getColor();
    public void move();
}

class Dog implements Animal {
    private String color = "BLACK";
    private double r = 9.0;
    @Override
    public void makeNoise() {
        //who cares what this actually does...
        System.out.println("Dog, making noise");
    }

    @Override
    public String getColor() {
        // this could actually do anything as long as it returns a color as a String
        double x = 3.14 *Math.pow(r,2);
        if( x> 5) {
            color = "AQUAMARINE";
        } else {
            color = "YELLOWGREEN";
        }
        return color;
    }

    @Override
    public void move() {
        //who cares what this actually does...
        System.out.println("Dog moving...");
    }
}

class Cat implements Animal {
    private String color = "BLACK";
    private double r = 9.0;
    @Override
    public void makeNoise() {
        //who cares what this actually does...
        System.out.println("Cat, making noise");
    }

    @Override
    public String getColor() {
        // this could actually do anything as long as it returns a color
        return color;
    }

    @Override
    public void move() {
        //who cares what this actually does...
        System.out.println("Cat moving...");
    }
}

// TODO ADD ANOTHER ANIMAL (i.e. Snake) AND USE IT IN THE LIST