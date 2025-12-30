package encapsulation;

public class Auth {
	private String username;
	private String password;
	Auth(String username , String password){
		this.username = username;
		this.password = password;
	}
	public void setPass(String password ,String newPass ) {
		if(this.password.equals(password)) {
			this.password = newPass;
		}
		else  System.out.print("Not Authentic User");
	}
	public String getPass(String password) {
		if(this.password.equals(password)) {
			return this.password;
		}
		return " ";
	}
	public void setUsername(String password ,String newUsername) {
		if(this.password.equals(password)) {
			this.username = newUsername;
		}
		else  System.out.print("Not Authentic User");
	}
	public String getUsername() {
			return username;
	}
	
	
	
}
