package HomeWork3;
/*
 * Litvinenko homework 3
 */

public class ArrayListPrime {
    public static void main(String[] args) {

        int nums[] = {10, 5, 34, 7, 26, 3, 59, 88, 13};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 ==1 )
                System.out.println("Prime: " + nums[i]);
        }
    }
}