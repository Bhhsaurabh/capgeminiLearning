package relationship;

public class University {
	private static String uniName = "Lpu";
	
	public String getUniName() {
		return uniName;
	}
	
	private Department dp = new Department();
	
	public Department getDepAs() {
		return dp;
	}
	
}
