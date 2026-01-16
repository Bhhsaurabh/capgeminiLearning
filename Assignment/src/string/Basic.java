package string;

public class Basic {
	
	// reverse a string
	public static String reverse(String str) {
		int i = 0;
		int j = str.length() - 1;
		char[] s = str.toCharArray();
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		return new String(s);
	}
	
	//isPalindrome
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		char[] s = str.toCharArray();
		while(i < j) {
			if(s[i++] != s[j--]) return false;
		}
		return true;
	}
	
	// count Vowel and Consonant 
	
	public static int[] countVoCo(String str) {
	    int vowel = 0;
	    int cons = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char ch = Character.toLowerCase(str.charAt(i));

	        if (ch >= 'a' && ch <= 'z') {   // letter check
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowel++;
	            } else {
	                cons++;
	            }
	        }
	    }
	    return new int[]{vowel, cons};
	}
	// Cnt no of char
	
	public static int count(String str) {
		int cnt = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <='Z') {
				cnt++;
			}
		}
		return cnt;
	}
	
	// cnt no of words
	
	public static int cntWord(String str) {
		int cnt = 0;
		String[] s = str.split("\\s+");
		for(String st :s) {
			cnt++;
		}
		return cnt;
		
	}
	// Remove spaces From String
	
	public static String removeSpace(String str) {
		String newStr = "";
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				newStr +=ch;
			}
		}
		return newStr;
	}
	
	
	
	public static void main(String[] args) {
		String a = "Hii";
		String b= "Hii";
		String str = "madam";
		String word = "Hello my name is     saurabh";
		System.out.println("Hello");
		System.out.println(str.length());
		System.out.println(reverse(str));
		System.out.println(isPalindrome(str));
		int[] res = countVoCo(str);
		System.out.println("Vowel: " + res[0] + " | Consonant: " + res[1]);
		System.out.println("Count: " + count(str));
		System.out.println("No of words Count: " + cntWord(word));
		// to upperCase
		
		System.out.println(str.toUpperCase());
		// to lowerCase
		System.out.println(str.toLowerCase());
		
		//comp
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(removeSpace(word));
		
	}
}
