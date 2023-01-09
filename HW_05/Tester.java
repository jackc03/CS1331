public class Tester {
    public static void main(String[] args) {
        String[] arr = {"Yellow", "Purple", "Green", "tomato", "Wolfenstein", "Burgundy"};
        String[][] arr2 = {
            {"Yellow", "Purple", "green", "tomato", "Wolfenstein", "Burgundy"},
            {"Bellow", "Burple", "Breen"},
            {"bomato", "Bolfenstein", "Wurgundy"}
        };
        String[][] arr5 = {
            {"Burgundy", "Green", "Purple", "Tomato", "Wolfenstein", "Yellow"},
            {"Bellow", "Breen", "Burple"},
            {"Bolfenstein", "Bomato", "Wurgundy"}
        };
        Recursion recursionTool = new Recursion();
        System.out.println("\n!Unsorted arr!");
        for (String i : arr) {
            System.out.println(i);
        }
        
        String[] arr3 = recursionTool.mergeSort(arr);
        
        System.out.println("\n!Sorted arr!");
        for (String i : arr3) {
            System.out.println(i);
        }




        
        System.out.println("\nYarr new test\n\n");
        for (int i = 0; i < arr2.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j){
                System.out.println(i + "\t" + j + "\t" + (arr2[i][j]));
            }
        }
        String[] arr4 = recursionTool.mergeAll(arr2);
        System.out.println("\nSorted new test\n");
        for (String string : arr4) {
            System.out.println(string);
        }


        System.out.println("\n\n\n\nYarr neclaw test 2\n\n");
        /*for (int i = 0; i < arr5.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j){
                System.out.println(i + "\t" + j + "\t" + (arr2[i][j]));
            }
        }*/
        
        System.out.println("unsorted arr5");
        for (int i = 0; i < arr5.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j){
                System.out.println(i + "\t" + j + "\t" + (arr2[i][j]));
            }
        }
        for (int i = 0; i < arr5.length; ++i) {
            arr5[i] = recursionTool.mergeSort(arr5[i]);
        }
        System.out.println("sorted arr5");
        for (int i = 0; i < arr5.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j){
                System.out.println(i + "\t" + j + "\t" + (arr2[i][j]));
            }
        }

        String[] arr6 = recursionTool.mergeAll(arr5);
        System.out.println("\nSorted new test\n");
        for (String string : arr6) {
            System.out.println(string);
        }
    }
}
