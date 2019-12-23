package HomeWork4;

public class TaskFour {
    public static void main(String[] args) {
        int matrixSize = 8;
        double numberOfColumns = Math.sqrt(matrixSize);
        if (numberOfColumns % 1 != 0)
            numberOfColumns++;
        int matrixElement = 1;

        System.out.println("The square matrix:");
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if ((matrixElement <= matrixSize) && matrixElement != 0) {
                    System.out.print(matrixElement + " ");
                    matrixElement++;
                } else {
                    matrixElement = 0;
                    System.out.print(matrixElement + " ");
                }
            }
            System.out.println();
        }
    }
}

