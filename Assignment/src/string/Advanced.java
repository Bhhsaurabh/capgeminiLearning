package string;

import java.util.*;

public class Advanced {

    // 1. Check if string contains only digits
    public static boolean onlyDigits(String str) {
        if (str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    // 2. Remove special characters
    public static String removeSpecialChar(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c) || c == ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 3. Check if string is rotation of another
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String temp = s1 + s1;
        return temp.contains(s2);
    }

    // 4. Find all permutations of a string
    public static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            permutations(left + right, ans + ch);
        }
    }

    // 5. Find longest palindrome substring
    public static String longestPalindrome(String str) {
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // 6. Compress string (aabbb -> a2b3)
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    // 7. Find maximum occurring character
    public static char maxOccurringChar(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxChar = e.getKey();
            }
        }
        return maxChar;
    }

    // 8. Convert String to Integer without parseInt
    public static int stringToInt(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }
        return num;
    }

    // 9. Split string without using split()
    public static void customSplit(String str) {
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word.append(str.charAt(i));
            } else {
                System.out.println(word);
                word.setLength(0);
            }
        }
        System.out.println(word);
    }

    // 10. Toggle case of each character
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

   
    public static void main(String[] args) {

        System.out.println("Only digits: " + onlyDigits("12345"));
        System.out.println("Only digits: " + onlyDigits("12a45"));

        System.out.println("--------------------------------");

        System.out.println("Remove special char: " +
                removeSpecialChar("He@llo# W$or%ld!"));

        System.out.println("--------------------------------");

        System.out.println("Rotation check: " +
                isRotation("ABCD", "CDAB"));

        System.out.println("--------------------------------");

        System.out.println("Permutations of ABC:");
        permutations("ABC", "");

        System.out.println("--------------------------------");

        System.out.println("Longest palindrome: " +
                longestPalindrome("babad"));

        System.out.println("--------------------------------");

        System.out.println("Compressed string: " +
                compressString("aabbbcc"));

        System.out.println("--------------------------------");

        System.out.println("Max occurring char: " +
                maxOccurringChar("helloooo"));

        System.out.println("--------------------------------");

        System.out.println("String to int: " +
                stringToInt("12345"));

        System.out.println("--------------------------------");

        System.out.println("Custom split:");
        customSplit("Hello my name is Saurabh");

        System.out.println("--------------------------------");

        System.out.println("Toggle case: " +
                toggleCase("HeLLo WorLD"));
    }
}