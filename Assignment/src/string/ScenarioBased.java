package string;

import java.util.*;

public class ScenarioBased {

    public static boolean validatePassword(String password) {
        if (password.length() < 8) return false;

        boolean upper = false, lower = false, digit = false, special = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) lower = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }

        return upper && lower && digit && special;
    }

    // 2. Email ID validation
    public static boolean validateEmail(String email) {

        if (!email.contains("@") || !email.contains(".")) return false;

        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');

        if (at < 1 || dot <= at + 1 || dot == email.length() - 1) {
            return false;
        }
        return true;
    }

    // 3. Count words starting with vowel
    public static int countWordsStartingWithVowel(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() > 0) {
                char c = word.charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    // 4. Find repeated words in a paragraph
    public static void findRepeatedWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        HashMap<String, Integer> mp = new HashMap<>();

        for (String word : words) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        System.out.println("Repeated words:");
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }
    }

    // 5. Remove extra spaces from a sentence
    public static String removeExtraSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        boolean space = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                sb.append(c);
                space = false;
            } else if (!space) {
                sb.append(c);
                space = true;
            }
        }
        return sb.toString().trim();
    }

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        System.out.println("Password validation:");
        System.out.println(validatePassword("Abc@1234")); // true
        System.out.println(validatePassword("abc123"));   // false

        System.out.println("--------------------------------");

        System.out.println("Email validation:");
        System.out.println(validateEmail("test@gmail.com"));   // true
        System.out.println(validateEmail("testgmail.com"));    // false

        System.out.println("--------------------------------");

        System.out.println("Words starting with vowel:");
        System.out.println(countWordsStartingWithVowel(
                "An apple is on an umbrella")); // 4

        System.out.println("--------------------------------");

        findRepeatedWords(
                "Java is great and Java is powerful");

        System.out.println("--------------------------------");

        System.out.println("Remove extra spaces:");
        System.out.println(
                removeExtraSpaces("  Hello   my   name   is   Saurabh   "));
    }
}