package StaticMembers;

public class CollegeDb {
	String collegeName = "Lpu";
	String name;
	int regNo;
	boolean isActive;
	
	CollegeDb(){
		
	}
	CollegeDb(String name){
		this();
		this.name = name;
	}
	CollegeDb(String name , int regNo){
		this(name);
		this.regNo = regNo;
	}
	CollegeDb(String name , int regNo, boolean isActive){
		this(name , regNo);
		this.isActive = isActive;
	}
	
	public void getData() {
		System.out.println("College Name : " + collegeName);
		System.out.println("Student Name : " + name);
		System.out.println("Reg No : " + regNo);
		System.out.println("Is account active : " + isActive);
	}
}
