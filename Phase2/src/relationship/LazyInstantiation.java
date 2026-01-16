package relationship;

public class LazyInstantiation {
	Tyre[] tyres = new Tyre[4];
	
	// helper method
	int i = 0 ;
	void addTyre(Tyre tyres) {
		this.tyres[i] = tyres;
		i++;
	}
}
