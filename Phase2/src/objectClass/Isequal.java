package objectClass;

public class Isequal {
	String name;
	int id;
	
	Isequal(String name , int id){
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object o) {
		 Isequal e =  (Isequal)o;
		if(this.name == e.name  && this.id == e.id ) return true;
		return false;
	}
}
