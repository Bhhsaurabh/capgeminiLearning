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
	public static void main(String[] args) {
		String a = "Hello";
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
		
		
		
	}
}
