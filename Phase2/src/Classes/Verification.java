package Classes;

public class Verification {
	String pan;
	String aadhar;
	String voter;
	
	Verification(){
		
	}
	Verification(String pan){
		this.pan = pan;
	}
	Verification(String aadhar , String pan){
		this.pan = pan;
		this.aadhar = aadhar;
	}
	Verification(String aadhar , String pan , String voter){
		this.pan = pan;
		this.aadhar = aadhar;
		this.voter = voter;
	}
	
}
