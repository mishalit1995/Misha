package HomeWork6_1;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Set you number: ");
        int i = num.nextInt();
        System.out.println("You recursion: " );
        recursion(i);
    }
    private static void recursion(int i){
        if (i == 0){
            return;
        }
        recursion(i-1);
        System.out.print(i + " " );
    }
}
