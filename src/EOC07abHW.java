import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class EOC07abHW {
    public static void main(String[] args) {
        EOC07abHW eoc07abHW = new EOC07abHW();
        eoc07abHW.e7_1();
    }

    public void e7_1() {
        int[] values = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
        for (int i = 9; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }

    public void e7_3() {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        double largest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }

        // Find smallest value
        double smallest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < smallest)
            {
                smallest = values[i];
            }
        }

        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (values[i] == largest)
            {
                System.out.print(" <== largest value");
            }
            // Identify smallest value
            else if (values[i] == smallest) {
                System.out.print(" <== smallest value");
            }
            System.out.println();
        }
    }

    public void e7_5() {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        double smallest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }
        System.out.println("Lowest score: " + smallest);

    }

    public void e7_7() {
        int[] values = {1, 4, 9, 16, 9, 7, 4 ,9, 11};
        for (int i = 8; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }

    public void e7_9() {
        int[] values = { 9, 13, 21, 4, 11, 7, 1, 3 };

        int i = 0;
        int j = values.length / 2;
        while (i < values.length / 2)
        {
            // Swap values at positions i and j
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            i++;
            j++;
        }
        System.out.println(Arrays.toString(values));
    }

    public void e7_11() {
        // swap first and last
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int first = values[0];
        values[0] = values[values.length - 1];
        values[values.length-1] = first;
        System.out.println(Arrays.toString(values));
    }

    public void e7_13() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 2, 5, 2, 3, 3, 6, 1, 4, 1};

        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        if (count >= arr1.length) {
            System.out.println("Both lists are identical");
        }
    }
}
