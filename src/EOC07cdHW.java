/**
 *
 * @author Aryan Inamdar
 * @version 4/9/21
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EOC07cdHW {
    public static void main(String[] args) {
        EOC07cdHW eoc07cdHW = new EOC07cdHW();
    }

    public void R7_1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(17);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(29);
        for (int num : numbers) {
            num += 1;
            System.out.println(num);
        }
        System.out.print(numbers);
    }

    public void R7_3() {
        // a
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // b
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        for (int i = 0; i <= 20; i += 2) {
            numbers2.add(i);
        }

        // c
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers3.add(i*i);
        }
    }

    public void R7_5() {
        // a
        int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        for (int i = 1; i < 10; i++) { a[i] = a[i - 1]; }
        System.out.println(Arrays.toString(a));

        // b
        for (int i = 9; i > 0; i--) { a[i] = a[i - 1]; }
        System.out.println(Arrays.toString(a));

        // c
        for (int i = 0; i < 9; i++) { a[i] = a[i + 1]; }
        System.out.println(Arrays.toString(a));
    }

    public void R7_7() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = 1;
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            }
            else if (nums[i] >= max) {
                max = nums[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public void R7_9() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // a
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        // b
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
        }
        System.out.println("\nMax: " + max);

        // c
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " negative numbers");
    }

    public void E7_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // a
        for (int i = 2; i < nums.length; i += 2) {
            System.out.print(nums[i] + ", ");
        }

        // b
        System.out.println();
        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i] + ", ");
        }

        // c
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + ", ");
        }

        // d
        System.out.println();
        System.out.println("First: " + nums[0]);
        System.out.println("Last: " + nums[nums.length - 1]);
    }

    public void E7_4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        sum -= min;
        System.out.println("Sum without smallest: " + sum);
    }

    public void E7_6() {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        for (int j = 1; j < nums.length; j += 2) {
            sum -= nums[j];
        }
        System.out.println("Alternating Sum: " + sum);
    }

    public void E7_16() {
        int[] nums = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            nums[i] = random.nextInt(99);
        }
        System.out.print("Unsorted: ");
        System.out.print(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println();
        System.out.print("Sorted: ");
        System.out.print(Arrays.toString(nums));
    }

    public void E7_19() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i ++) {
            System.out.print("* ");
        }
    }
}
