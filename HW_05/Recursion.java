/**
 * Recursion assignment.
 * @author jcochran66
 * @version 1
 */
public class Recursion {
    /**
     * Implementation of merge sort.
     * Recursive call is in main else() branch.
     * @param arr of strings
     * @return array of strings
     */
    public static String[] mergeSort(String[] arr) {
        int begin;
        int end;
        end = arr.length - 1;
        begin = 0;
        if (begin == end) {
            return arr;
        } else if (arr.length == 2) {
            if (arr[0].compareToIgnoreCase(arr[1]) <= 0) {
                return arr;
            } else {
                String temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
                return arr;
            }
        } else {
            String[] subArr1 = RecursionUtils.copyOfRange(arr, 0, (arr.length) / 2);
            String[] subArr2 = RecursionUtils.copyOfRange(arr, (arr.length) / 2, arr.length);

            subArr1 = mergeSort(subArr1);
            subArr2 = mergeSort(subArr2);

            return RecursionUtils.merge(subArr1, subArr2);
        }
    }


    /**
     * Merge all method.
     * @param mainArr 2d array
     * @return 1 d array
     */
    public static String[] mergeAll(String[][] mainArr) {
        //If input arr indices are unsorted, sort them now
        //for (int i = 0; i < mainArr.length; ++i) {
        //    mainArr[i] = mergeSort(mainArr[i]);
        //}

        if (mainArr.length == 1) {
            return mainArr[0];
        } else {
            String[][] newMainArr = new String[mainArr.length - 1][];
            String[] arr = mainArr[0];
            for (int i = 1; i < mainArr.length; ++i) {
                newMainArr[i - 1] = mainArr[i];
            }
            newMainArr[mainArr.length - 2] = mainArr[mainArr.length - 1];
            String[] output = RecursionUtils.merge(arr, mergeAll(newMainArr)); //this is where recursion happens

            return output;
        }

    }

    /**
     * Method to count duplicate characters.
     * @param arr Array of Strings
     * @return countie - int, counter
     */
    public static int countDuplicates(String[] arr) {
        int i, countie; //"count"+"ie"
        i = 0;
        countie = 0;

        if (arr.length <= 1) {
            return countie;
        }
        while (i < arr.length && arr[i].equals(arr[i + 1])) {
            countie++;
            i++;
        }
        if (i == arr.length) {
            return countie;
        }
        String[] newArr = RecursionUtils.copyOfRange(arr, i + 1, arr.length);
        return countie + countDuplicates(newArr); //This is where recursion happens
    }

    /**
     * Verify palindrom method.
     * @param s1 String
     * @return boolean
     */
    public static boolean verifyPalindrome(String s1) {
        if (s1 == null) {
            return false;
        } else if (s1.compareTo("") == 0) {
            return true;
        } else if (s1.length() == 1) {
            return true;
        }
        s1 = s1.toUpperCase();

        return s1.charAt(0) == s1.charAt(s1.length() - 1) && verifyPalindrome(s1.substring(1, s1.length() - 1));
    }

    /**
     * Method to find num of interior points.
     * @param radius int
     * @param point Point[]
     * @return numPoints int
     */
    public static int numInteriorPoints(Point[] point, int radius) {
        Point[] newPoint = new Point[point.length - 1];
        for (int i = 1; i < point.length; ++i) {
            newPoint[i - 1] = point[i];
        }

        if (point.length == 0) {
            return 0;
        } else if (point[0] == null) {
            return numInteriorPoints(newPoint, radius);
        }

        double x = (double) point[0].getX();
        double y = (double) point[0].getY();
        double r = Math.sqrt(x * x + y * y);

        if (r >= radius) {
            return numInteriorPoints(newPoint, radius);
        } else {
            return 1 + numInteriorPoints(newPoint, radius);
        }

    }
}