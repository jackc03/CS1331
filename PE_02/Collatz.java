//import java.util.concurrent.ThreadLocalRandom;
public class Collatz{
    public static void main(String[] args){
        int collatzNum, numSteps, highestNumReached, initValue;
        //int randomNum = ThreadLocalRandom.current().nextInt(1,101);

        collatzNum        = 47;
        numSteps          = 0;
        highestNumReached = collatzNum;
        initValue         = collatzNum;
        System.out.println(collatzNum);


        while(collatzNum != 1){

            if(collatzNum % 2 == 0){
                collatzNum /= 2;               
            }
            else{
                collatzNum = 3 * collatzNum + 1;
            }

            if(collatzNum > highestNumReached){
                highestNumReached = collatzNum;
            }

            System.out.println(collatzNum);
            numSteps++;
        }
        
        System.out.println("Initial value: "           + initValue);
        System.out.println("Number of steps: "         + numSteps);
        System.out.println("Highest number reached: "  + highestNumReached);

        switch(numSteps){
            case 0:  System.out.println("No steps required");
                break;
            case 1:  System.out.println("Only took one step!");
                break;
            case 2:  System.out.println("Two steps");
                break;
            case 3:  System.out.println("Three steps");
                break;
            case 4:  System.out.println("Four steps");
                break;
            default: System.out.println("Wow, " + numSteps + " steps was a lot of steps!");
                break;
        }
    }
}