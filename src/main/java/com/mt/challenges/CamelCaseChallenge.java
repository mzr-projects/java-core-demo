package com.mt.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCaseChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            List<String> temp = getTheCommand(input);
            System.out.println(applyCommand(temp));
        }
        sc.close();
    }

    private static String applyCommand(List<String> values) {
        String result = null;

        String entry = values.get(0);
        String s = values.get(1);

        switch (entry) {
            case "SM", "SC", "SV" ->
                    result = separateCore(s).substring(0, 1).toLowerCase() + separateCore(s).substring(1);
            case "CM" -> result = combineCore(s) + "()";
            case "CC" -> result = combineCore(s).substring(0, 1).toUpperCase() + combineCore(s).substring(1);
            case "CV" -> result = combineCore(s);
        }

        return result;
    }

    private static String separateCore(String s) {
        String result = null;
        char[] textInCharacters = s.toCharArray();
        for (int i = 0; i < textInCharacters.length; i++) {
            if (Character.isUpperCase(textInCharacters[i])) {
                result = s.substring(0, i) + " " + s.substring(i).toLowerCase();
            }
        }
        return result.replace("()", "");
    }

    private static String combineCore(String s) {
        String result;
        char[] textInCharacters = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                textInCharacters[i + 1] = Character.toUpperCase(textInCharacters[i + 1]);
            }
        }
        result = String.valueOf(textInCharacters).replace(" ", "");
        return result;
    }

    private static List<String> getTheCommand(String text) {
        List<String> values = new ArrayList<>();
        values.add(text.charAt(0) + String.valueOf(text.charAt(2)));
        values.add(getTheRealText(text));
        return values;
    }

    private static String getTheRealText(String text) {
        int semiColonCount = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (semiColonCount == 2)
                return text.substring(i);

            if (String.valueOf(text.charAt(i)).equals(";")) {
                semiColonCount++;
            }
        }

        return null;
    }
}
