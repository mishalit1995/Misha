package regularExpressiond;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
    private String strings;

    public Utils(String string) {
        this.strings = string;
    }

    public HashMap<String, Integer> countDuplicates () {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String text : strings.split("\\W+")) {
            if (hashMap.containsKey(text)) {
                int count = hashMap.get(text);
                count++;
                hashMap.put(text, count);
            } else {
                hashMap.put(text, 1);
            }
        }
        return hashMap;
    }

    public String changeCharacter(int k, char newSymbol) {
        String str = Arrays.stream(strings.split("\\W+"))
                .map(StringBuilder::new)
                .peek(x -> {
                    if (x.length() >= k) x.insert(k - 1, newSymbol);
                }). collect(Collectors.joining(" "));
        return str;
    }

    public String firstLast() {
      String newList = Stream.of(strings.split("\\W+"))
              .map(StringBuffer::new)
              .filter(x -> x.charAt(0) == x.charAt(x.length() - 1))
              .distinct()
              .collect(Collectors.joining(" "));
      return newList;
    }

    public int countPunctuationMarks() {
        Pattern pattern = Pattern.compile("[\\p{P}]");
        Matcher matcher = pattern.matcher(strings);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
