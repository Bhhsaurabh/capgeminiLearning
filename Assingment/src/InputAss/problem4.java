package InputAss;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you num : ");
		int num = sc.nextInt();
		if((num & 1) == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}

}
