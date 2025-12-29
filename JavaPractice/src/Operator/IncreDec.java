package Operator;

public class IncreDec {
	public static void main(String[] args) {
		int a = 5;
		int b = a++ + ++a +a;
		int c = --a + ++b + b--;
		int d = a + b + c + a--;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
}
