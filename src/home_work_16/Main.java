package regularExpressiond;

public class Main {
    public static void main(String[] args) {

        String text = "This software and related documentation are provided under a bob license agreement containing " +
                "restrictions on use and disclosure and are protected by intellectual property laws. Except as + " +
                "expressly permitted in your icense agreement or allowed by law, you may not use, copy, reproduce," +
                " translate, broadcast, modify, license,transmit, distribute, exhibit, perform, publish, or display" +
                " any part, in any form, or by any means.";


        Utils utils = new Utils(text);

        System.out.println(utils.countDuplicates());
        System.out.println(utils.changeCharacter(3, '?'));
        System.out.println(utils.firstLast());
        System.out.println(utils.countPunctuationMarks());
    }
}
