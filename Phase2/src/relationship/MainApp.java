package relationship;

public class MainApp {
	public static void main(String[] args) {
		Car c = new Car("BMW");
		System.out.println(c.getModel());
		
		System.out.println(c.getEngine().getHp());
		
		
		University u = new University();
		u.getDepAs().setDep(32, "School of CSE");
		
		System.out.println(u.getDepAs().getBlock());
		
		System.out.println("print Tyres");
		Tyre[] newTyres = {
			    new Tyre("Apollo"),
			    new Tyre("Bridgestone"),
			    new Tyre("MRF"),
			    new Tyre("Ceat"),
			    new Tyre("Og")
			    
			    
			};
		
		c.setTyre(newTyres);
		for(int i = 0 ; i < c.getTyre().length; i++) {
			System.out.print(c.getTyre()[i].getBrand() + " ");
		}
		
		// lazy instantiation
		LazyInstantiation lz = new LazyInstantiation();
		lz.addTyre(new Tyre("Mrf"));
		lz.addTyre(new Tyre("M3f"));
		lz.addTyre(new Tyre("M2f"));
		lz.addTyre(new Tyre("M1f"));
		System.out.println();
		System.out.println("Lazy ..............");
		for(int i = 0 ; i < lz.tyres.length; i++) {
			System.out.print(lz.tyres[i].getBrand() + " ");
		}
		
	}
}
