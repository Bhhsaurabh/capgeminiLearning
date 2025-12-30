package StaticMembers;

public class CollegeDbApp {
	public static void main(String[] args) {
		CollegeDb s1 = new CollegeDb("saurabh" , 12219584 , true);
		CollegeDb s2 = new CollegeDb("Aman" );
		s1.getData();
		System.out.println();
		s2.getData();
	}
}
