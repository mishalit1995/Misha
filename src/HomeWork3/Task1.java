package HW4;
/*
 * Litvinenko homework 4
 */
//Даны две последовательности целых чисел а1, а2, …, аn и c1, c2, …, ck, n ≥ k.
// Выяснить, является ли вторая последовательность подпоследовательностью
// первой. Например, последовательность 4, 6, 3 является подпоследовательностью
// последовательности 0, 2, 4, 6, 3, -1, 1.

import java.lang.reflect.GenericDeclaration;

public class Task1 {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 4, 6, 10, 13, 15, 3, 4, 5};
        int[] num2 = {6, 10, 13};

//        int n1 = num1[n];
//        int k1 = num2[k];
//        while (n1 > 0)(k1 > 0){
//            if (num1[n1] = num2[k1]) {
//                n1 = n1 - 1;
//                k1 = k1 - 1;
//            }else {
//                n1 = n1 - 1;
//            }
//
//            }
//        }

            for (int n : num1) {
                for (int k : num2) {
                    if (num1[n] == num2[k]) {
                        n = n - 1;
                        k = k - 1;
                        System.out.println(num1[n]);
                        break;
                    } else
                        num1[n] = num1[n - 1];
                    System.out.println(num1[n]);
                    break;
                }

            }
        }
    }












