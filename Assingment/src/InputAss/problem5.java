package InputAss;
import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enete you num : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("Zero");
		}else if(num < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
	}

}
