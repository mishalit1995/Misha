package home_work_findWords;

import java.util.HashMap;
import java.util.Map;

public class Print {
    public static void print(HashMap<String, Integer> hashMap) {

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.print(entry.getKey() + "-" + entry.getValue() + ";\n");
    }
}
