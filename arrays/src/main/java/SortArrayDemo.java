import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {
    public static void main(String[] args) {
        // prompt the user for how size of array
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scanner.nextInt();
        // initialize the array based on the size
        int[] myDataArray = new int[size];
        // read each number and assign to an array element
        for (int i = 0; i < myDataArray.length; i++) {
            System.out.print(" Enter number " + (i + 1) + ": ");
            myDataArray[i] = scanner.nextInt();
        }
        System.out.println();
        // print out the array elements
        System.out.println("BEFORE sorting:");
        displayData(myDataArray);
        System.out.println();
        Arrays.sort(myDataArray);
        System.out.println("AFTER sorting:");
        displayData(myDataArray);
        scanner.close();
    }

    private static void displayData(int[] myDataArray) {
        // display contents of the array
        for (int temp : myDataArray) {
            System.out.println(temp);
        }
    }
}
