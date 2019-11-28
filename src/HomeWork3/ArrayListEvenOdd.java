package HomeWork3;
/*
 * Litvinenko homework 3
 */

public class ArrayListEvenOdd {
    public static void main(String[] args) {

        int nums[] = {10, 13, 34, 53, 26, 43, 59, 88, 135};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                System.out.println("Even: " + nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                System.out.println("Odd: " + nums[i]);
        }
    }
}

