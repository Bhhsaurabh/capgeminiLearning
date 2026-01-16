package methodChaining;

public class Demo {
	Demo m1() {
		return this;
	}
	Demo m3() {
		return this;
	}
	Demo m2() {
		return this;
	}
	Demo m4() {
		return this;
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo s = d.m1().m2().m3().m4();
		System.out.println(s);
	}
}
