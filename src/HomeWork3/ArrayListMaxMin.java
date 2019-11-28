package HomeWork3;
/*
 * Litvinenko homework 3
 */

public class ArrayListMaxMin {
    public static void main(String[] args) {

        int nums[] = {10, 5, 34, 7, 3, 26, 3, 59, 88, 13};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) max = Math.max(max, nums[i]);
        {
                System.out.println("Max number: " + max);
        }

        for (int i = 0; i < nums.length; i++) min = Math.min(min, nums[i]);
        {
            System.out.println("Min number: " + min);
        }
    }
}
