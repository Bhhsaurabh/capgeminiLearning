package Variables;

public class Variables {
	static int a = 10; // global
	
	public static void main(String[] args) {
		int a; //using without initializing
		System.out.println(a);
	}
	public static void Hello() {
		int a  = 10; // you can not initialize two var with same name locally
		int a = 20;
		System.out.println(a);
		
	}
	System.out.println(a);// same scope
}
