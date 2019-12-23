package HomeWork4;

public class TaskThree {
    public static void main(String[] args) {
        int[] array = new int[]{12344, 23, 12345, 6, 13, 192, 876, 98311};

        System.out.print("Numbers with all different digits: ");
        for (int i = 0; i < array.length; i++) {
            int[] numbers = new int[10];
            int number = array[i];
            for (int j = 1; j <= lengthCount(array[i]); j++) {
                int lastNumber = number % 10;
                if (numbers[lastNumber] < 1) {
                    numbers[lastNumber]++;
                } else {
                    break;
                }
                if (number / 10 == 0) {
                    System.out.print(array[i] + " ");
                } else {
                    number /= 10;
                }
            }
        }

    }
    public static int lengthCount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

