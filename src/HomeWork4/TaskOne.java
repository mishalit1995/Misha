package HomeWork4;

public class TaskOne {
    public static void main(String[] args) {

        int[] firstArray = new int[]{1, 2, 3, 1, 10, 6, 7, 8, 5, 3};
        int[] secondArray = new int[]{5, 4};

        int num = 0;
        boolean previousNum = true;
        for (int i = 0; i < firstArray.length; i++) {
            if (num == secondArray.length) {
                break;
            }
            if (!previousNum) {
                num = 0;
            }
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    num++;
                    previousNum = true;
                    break;
                } else {
                    previousNum = false;
                }
            }
        }
        if (num == secondArray.length) {
            System.out.println("The first array has the second array.");
        }
    }
}

