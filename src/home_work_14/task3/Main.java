package home_work_findWords;

import java.util.HashMap;

import static home_work_findWords.CountWords.countWord;
import static home_work_findWords.Print.print;

public class Main {
    public static void main(String[] args) {

        String text = "Cats, also called domestic cats (Felis catus), are small, carnivorous (meat-eating) mammals," +
                " of the family Felidae. Domestic cats are often called house cats when kept as indoor pets.";

        HashMap<String, Integer> hashMAp;

        hashMAp = countWord(text);

        print(hashMAp);
    }
}
