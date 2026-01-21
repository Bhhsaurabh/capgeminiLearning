package wrapperClass;

public class Boxing {
	public static void main(String[] args) {
		// Boxing - wrapping primitive data type into non-primitive box
		int a = 10;
		Integer i = new Integer(a);
		
		//or 
		
		Integer i1 = Integer.valueOf(a);
		
		// auto Boxing
		
		Integer a2 = a;
		
		// UnBoxing
		
		int b = i.intValue();
		System.out.println(b);
		
		// you can do same for other dataTypes
	}
}
