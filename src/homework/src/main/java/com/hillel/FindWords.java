package com.hillel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class FindWords {


    public static String findWord(String word) throws IOException {
        int number = 0;
        for (String str : getWords()) {
            if(str.equals(word)){
                number++;
            }
        }
        return String.valueOf(number);
    }

    private static String[] getWords() throws IOException {

        try (FileReader fileReader = new FileReader(getFile());
             BufferedReader br = new BufferedReader(fileReader)) {

            String content;
            while ((content = br.readLine()) != null) {
                return content.replaceAll("[\\p{P}]", "").split(" ");
            }
        }
        return null;
    }

    public static File getFile() {
        String fileName = "Text.txt";
        ClassLoader classLoader = FindWords.class.getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw  new IllegalArgumentException("File not found");
        } else {
            return new File(resource.getFile());
        }
    }
}
