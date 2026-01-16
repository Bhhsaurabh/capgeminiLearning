package Encapsulation;

public class Password {
	private int password;
	Password(){
		
	}
	Password(int password ){
		this.password = password;
	}
	
	public void setpassword(int password , int newpassword) {
		if(this.password == password) {
			this.password = newpassword;
		}else {
			System.out.println("Enter Valid password first!");
		}
	}
	public void getpassword() {
		System.out.println("Your password is : " + password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password a= new Password(292);
		a.getpassword();
		a.setpassword(292, 3230);
		a.getpassword();
	}

}
