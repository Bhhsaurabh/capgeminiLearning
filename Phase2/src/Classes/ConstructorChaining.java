package Classes;

public class ConstructorChaining {
	String pan;
	String aadhar;
	String voter;
	
	ConstructorChaining(){
		
	}
	ConstructorChaining(String pan){
		this();
		this.pan = pan;
	}
	ConstructorChaining(String aadhar , String pan){
		this(pan);
		this.aadhar = aadhar;
	}
	ConstructorChaining(String aadhar , String pan , String voter){
		this(aadhar , pan);
		this.voter = voter;
	}
}
