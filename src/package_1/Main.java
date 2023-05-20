package package_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task_1();
        //task_2();
        //task_3();
        //task_4();
    }
    public static void task_1() {
        Scanner help = new Scanner(System.in);

        System.out.print("your string: ");
        String string = help.nextLine();

        int StringSize = string.length();

        System.out.print(StringSize);
    }

    public static void task_2() {
        int[] nums = new int[]{6, 4, 9, 3, 10, 6, 34, 8, 5, 3};

        for (int i = 0; i <= nums.length; i++) {
            if (i % 2 != 0) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void task_3() {
        int[] nums = new int[]{6, 4, 9, 3, 10, 6, 34, 8, 5, 3};
        int min = 100000;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
    }

    public static void task_4() {
        int target = 9;
        int a = 0, b = 0;
        int[] nums = new int[]{6, 4, 3};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                    System.out.println(a + " " + b);
                }
            }
        }
    }
}