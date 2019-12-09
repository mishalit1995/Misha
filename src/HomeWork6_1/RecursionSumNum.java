package HomeWork6_1;



public class RecursionSumNum {
    public static void main(String[] args) {

        System.out.println(recursionSumNum(4));
    }
    private static  int recursionSumNum(int i){
        if(i==1)
            return 1;
        return i*(recursionSumNum(i-1));
    }
}
