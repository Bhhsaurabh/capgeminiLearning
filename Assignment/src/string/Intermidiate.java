package string;
import java.util.*;
public class Intermidiate {
	
	//find duplicate char in string
	public static char[] findDu(String str) {
		char[] ch = new char[126];
		HashMap<Character , Integer> mp = new HashMap<>();
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				mp.put(c,mp.getOrDefault(c, 0) + 1);
			}
		}
		int i = 0;
		for(HashMap.Entry<Character,Integer>e : mp.entrySet()) {
			if(e.getValue() > 1) {
				ch[i++] = e.getKey();
			}
		}
		return ch;
		
	}
	//find frequency of a char
	
	public static void findFreq(String str) {
		HashMap<Character , Integer>mp = new HashMap<>();
		for(int i = 0 ; i < str.length() ; i++) {
			char c  = str.charAt(i);
			if(c != ' ') {
				mp.put(c,mp.getOrDefault(c, 0) + 1);
			}
		}
		for(HashMap.Entry<Character , Integer> e : mp.entrySet()) {
			if(e.getValue() > 1) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}
	}
	// replace a char in string
	public static String replaceChar(String str , char oldChar , char newChar) {
		boolean got = false;
		char [] ch = str.toCharArray();
		for(int i = 0 ; i < str.length() ; i++) {
			if(ch[i] == oldChar) {
				ch[i] = newChar;
				got = true;
			}
		}
		if(got) {
			return new String(ch);
		}
		return "Char not found";
		
	}
	// is Anagram
	public static boolean isAnagram(String str1 , String str2) {
		if(str1.length() != str2.length()) return false;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i = 0 ; i < c1.length ; i++) {
			if(c1[i] != c2[i]) return false;
		}
		return true;
	}
	// remove duplicate char
	public static String removeDuplicate(String str) {
		if(str.length() <=0) return "";
		Set<Character> s = new LinkedHashSet<>();
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			s.add(c);
		}
		StringBuffer s1 = new StringBuffer();
		for(char c : s) {
			s1.append(c);
		}
		return s1.toString();
	}
	
	// find first non repeating char
	public static char findChar(String str) {
		if(str.length() <= 0) return ' ';
		HashMap<Character, Integer>mp = new LinkedHashMap<>();
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			mp.put(ch ,mp.getOrDefault(ch, 0) + 1);
		}
		for(HashMap.Entry<Character,Integer>e : mp.entrySet()) {
			if(e.getValue() == 1) {
				return e.getKey();
			}
		}
		return ' ';
		
	}
	// reverse a string
	public static String reverseString(String str) {
		char[] ch = str.toCharArray();
		int i = 0;
		int j = ch.length -1 ;
		while(i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	// reverse each word in a string
	public static void reverseStringWord(String str) {
		StringBuilder newStr = new StringBuilder();
		String[] strAr = str.split("\\s+");
		for(String s: strAr) {
			String newString = reverseString(s);
			newStr.append(newString);
			newStr.append(" ");
		}
		System.out.println(newStr);
	}
	// convert first letter of a word to uppercase
	public static void conToUpperCase(String str) {
		StringBuilder sb = new StringBuilder();
		String[] st = str.split("\\s+");
		for(String s : st) {
			sb.append(Character.toUpperCase(s.charAt(0)));
			sb.append(s.substring(1));
			sb.append(" ");
		}
		System.out.println(sb);
	}
	// find longest word in a String
	public static void longWord(String str) {
	    String[] st = str.split("\\s+");

	    String longest = "";
	    for (String s : st) {
	        if (s.length() > longest.length()) {
	            longest = s;
	        }
	    }

	    System.out.println("String: " + longest +
	                       " length: " + longest.length());
	}
	
	// count occurrences of a substring
	public static int countSubstring(String str, String sub) {
	    if (str.length() < sub.length()) return 0;

	    int count = 0;
	    for (int i = 0; i <= str.length() - sub.length(); i++) {
	        if (str.substring(i, i + sub.length()).equals(sub)) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		String a = "aaHello";
		String word = "Hello my name is Saurabh";
		String str = "HelloHelloaLet’s repeat patterns & noise: abcABCabcABC!!!###@@@$$$%%%^^^&&&*((()))___+++===—|||///???:::;;;,,,….\n"
				+ "Random tokens: _tmpVar1 = value@123; if(x>=10 && y<=20){return xy + z%2;} // Java-like\n"
				+ "Unicode madness: π≈3.14159, √2≈1.414, λ→∞, Ω≠0, Δx/Δt, ∑(i=0→n), ∫₀^∞ e^(−x²)dx\n"
				+ "Emails & URLs: test.email+spam@gmail.com, admin@domain.co.in, https://example.com/path?x=10&y=20#anchor\n"
				+ "More noise!!! !!!@@@###$$$%%%^^^&&&???!!!~~~\n"
				+ "End with repetition to inflate size: abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@# abc123!@";
		char[] c= findDu(str);
//		for(char ch : c) {
//			System.out.print(ch + " ");
//		}
		
		findFreq(str);
		
		System.out.println("Replace : " + replaceChar(a , 'H' , 'f'));
		System.out.println(isAnagram("Hello","olleh"));
		System.out.println("remove duplicate: " + removeDuplicate("hello"));
		System.out.println("------------------------------------------");
		System.out.println("First non rep char: " + findChar(a));
		System.out.println("------------------------------------------");
		System.out.println("Reverse Words in a String: ");
		reverseStringWord(word);
		System.out.println("------------------------------------------");
		System.out.println("First letter upper: ");
		conToUpperCase(word);
		System.out.println("------------------------------------------");
		longWord(word);
		System.out.println("------------------------------------------");
		
		
		
	}
}
