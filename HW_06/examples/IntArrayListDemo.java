    import java.util.ArrayList;
    
    public class IntArrayListDemo {
        public static void main(String[] args) {
            ArrayList<Integer> scores = new ArrayList<>();
            scores.add(90);  // autoboxing from int to Integer
            scores.add(95);  // autoboxing from int to Integer
            scores.add(110); // autoboxing from int to Integer
            scores.add(99);  // autoboxing from int to Integer
            scores.add(105); // autoboxing from int to Integer
            System.out.println(scores.toString());
            
            int sum = 0;
            for (Integer score : scores) { // for each loop
                sum += score; // autounboxing from Integer to int
            }
            System.out.println("Total points: " + sum);
        }
    }
    
