import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        System.out.println("Sum: " + getSum(arr));
        System.out.println("Mean: " + getMean(arr));
        System.out.println("Median: " + getMedian(arr));
        System.out.println("Mode: " + getMode(arr));
    }

    // Assigned to Athena
    public static int getSum(int[] arr) {
        return 0;
    }

    // Assigned to Jared
    public static float getMean(int[] arr) {
        return 0;
    }

    // Assigned to Alvin
    public static float getMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {// check if there are even amount of numbers
            int mid = arr.length / 2;
            return (arr[mid] + arr[mid - 1]) / 2;
        } else {
            int mid = (int) (arr.length / 2);
            return arr[mid];
        }
    }

    // Assigned to Jaden
    public static int getMode(int[] arr) {
        // Make a sorted version of arr
        int[] myArr = new int[arr.length];
        System.arraycopy(arr, 0, myArr, 0, arr.length);
        Arrays.sort(myArr);

        // Find the most frequently occurring integer (or the first in a tie)
        int mode = myArr[0];
        int maxCount = 0;
        int currentVal = myArr[0];
        int currentCount = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != currentVal) {
                currentCount = 0;
            }
            currentVal = myArr[i];
            currentCount++;
            if (currentCount > maxCount) {
                mode = myArr[i];
                maxCount = currentCount;
            }
        }

        // Return the mode
        return mode;
    }
}