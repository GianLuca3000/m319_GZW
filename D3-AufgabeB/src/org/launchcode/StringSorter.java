package org.launchcode;

import java.util.Scanner;

public class StringSorter {

    private Scanner scanner = new Scanner(System.in);

    private String GetSentence(){
        System.out.println("Insert a sentence");
        return scanner.nextLine();
    }

    public String SetConsonantesToUpper(){
        String sentence = GetSentence();
        StringBuilder result = new StringBuilder();

        for (char c:sentence.toCharArray()) {
            if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u'){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }

        return result.toString();
    }
}
