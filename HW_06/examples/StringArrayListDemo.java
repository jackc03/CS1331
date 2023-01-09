    import java.util.ArrayList;
    
    public class StringArrayListDemo {
        public static void main(String[] args) {
            // could also = new ArrayList<String>();
            // Default capacity is 10
            ArrayList<String> genres = new ArrayList<>(); 
            
            genres.add("Rock");         // goes into index 0 in backing array
    		genres.add("Pop");          // goes into index 1 in backing array
    		genres.add("Hip hop");      // goes into index 2 in backing array
    		genres.add("Salsa");        // goes into index 3 in backing array
    		genres.add("Country");      // goes into index 4 in backing array
    		genres.add("Chiptune");     // goes into index 5 in backing array
    		genres.add("Noise");        // goes into index 6 in backing array
    		genres.add("Vaporwave");    // goes into index 7 in backing array
            genres.add("Dark ambient"); // goes into index 8 in backing array
            System.out.println(genres.toString());
            
            genres.remove("Noise");
            System.out.println(genres.toString());
            System.out.println("Contains \"Chiptune\"? " 
                                    + genres.contains("Chiptune"));
            System.out.println("Contains \"Noise\"? " 
                                    + genres.contains("Noise"));
            genres.add("Noise"); // adds "Noise" back to bottom of list
            genres.add(3, "Jazz"); // insert between elements 2 and 3 (hiphop and salsa)
            System.out.println(genres.toString());
        }
    }
    
