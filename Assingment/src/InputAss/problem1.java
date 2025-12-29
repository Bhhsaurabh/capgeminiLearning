package InputAss;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num :");
		int num = sc.nextInt();
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println("It is div by 5 and 11");
		}else {
			System.out.println("Not div by 5 and 11");
		}
		sc.close();
	}

}
