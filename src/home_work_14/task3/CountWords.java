package home_work_findWords;

import java.util.HashMap;

public class CountWords {
    public static HashMap<String, Integer> countWord(String text) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String word : text.split("\\W+")) {
            if (hashMap.containsKey(word)) {
                Integer count = hashMap.get(word);
                count++;
                hashMap.put(word, count);
            } else {
                hashMap.put(word, 1);
            }
        }
        return hashMap;
    }
}
