package HomeWork4;

public class TaskTwo {
    public static void main(String[] args) {

    int[] array = new int[]{55, 2, 999, 1, 54, 3683, 1, 5, 9};


        for (int i = array.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
                int a = array[j];
                array[j] = array[j + 1];
                array[j + 1] = a;
            }
        }
    }
        System.out.print("The shortest number: ");
        for (int i = 0; i < array.length - 1; i++) {
        if (lengthCount(array[i]) == lengthCount(array[i + 1])) {
            System.out.print(array[i] + ", ");
        } else {
            System.out.print(array[i]);
            break;
        }
    }

        System.out.println();

        System.out.print("The longest number: ");
        for (int i = array.length - 1; i > 0; i--) {
        if (lengthCount(array[i]) == lengthCount(array[i - 1])) {
            System.out.print(array[i] + " ");
        } else {
            System.out.print(array[i]);
            break;
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
