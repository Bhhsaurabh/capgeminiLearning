package Methods;


public class ArgumentedMethod {
	public static int Sum(int a , int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int sum = Sum(10,20);
		System.out.println("Sum : " + sum);
	}
}
