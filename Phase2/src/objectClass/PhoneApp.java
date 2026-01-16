package objectClass;

public class PhoneApp {
	public static void main(String[] args) {
		Phone p1 = new Phone("Samsung");
		p1.setInternalParts(new InternalParts(6 , 10));
		p1.setInternalParts(new InternalParts(16 , 30));
		p1.setInternalParts(new InternalParts(18 , 34));
		
		System.out.println(p1);
		System.out.println();
		Phone p2 = new Phone("Nokia");
		p2.setInternalParts(new InternalParts(6 , 10));
		p2.setInternalParts(new InternalParts(16 , 30));
		p2.setInternalParts(new InternalParts(18 , 34));
		
		System.out.println(p2);
	}
}
