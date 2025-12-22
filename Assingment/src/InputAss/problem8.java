package InputAss;
import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks for Sub1: ");
        double marks1 = sc.nextDouble();

        System.out.println("Enter Marks for Sub2: ");
        double marks2 = sc.nextDouble();

        System.out.println("Enter Marks for Sub3: ");
        double marks3 = sc.nextDouble();

        System.out.println("Enter Marks for Sub4: ");
        double marks4 = sc.nextDouble();

        System.out.println("Enter Marks for Sub5: ");
        double marks5 = sc.nextDouble();

        double per = (marks1 + marks2 + marks3 + marks4 + marks5) / 500 * 100;

        System.out.println("Percentage: " + per);

        if (per < 40) {
            System.out.println("Grade: I (Fail)");
        } 
        else if (per < 60) {
            System.out.println("Grade: B+");
        } 
        else if (per < 80) {
            System.out.println("Grade: A");
        } 
        else if (per < 90) {
            System.out.println("Grade: A+");
        } 
        else {
            System.out.println("Grade: O");
        }

        sc.close();
    }
}