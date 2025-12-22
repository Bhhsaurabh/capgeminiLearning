package typeCasting;

public class TypeCasting {
	public static void main(String[] args) {
		// two type of type casting
		// 1. primitive  2. non primitive
		
		//1.primitive 🤡
		
		//1. widening  | happens implicitly smaller -> larger data type
		
		int a = 10;
		double b = a;
		System.out.println(((Object)b).getClass().getSimpleName());
		
		//2. Narrowing | happens explicitly  larger -> smaller data type
		
		double a1 = 10.2;
		// you will get CTE so convert it explicitly int b1  = a1; 
		int b1 = (int)a1;
		System.out.println(((Object)b1).getClass().getSimpleName());
		
	}
}
