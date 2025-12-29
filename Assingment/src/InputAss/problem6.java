package InputAss;
import java.util.Scanner;

public class problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month name : ");
        String name = sc.nextLine().trim().toLowerCase();

        switch (name) {
            case "january":
                System.out.println("31 days");
                break;
            case "february":
                System.out.println("28 days in a common year and 29 days in leap years");
                break;
            case "march":
                System.out.println("31 days");
                break;
            case "april":
                System.out.println("30 days");
                break;
            case "may":
                System.out.println("31 days");
                break;
            case "june":
                System.out.println("30 days");
                break;
            case "july":
                System.out.println("31 days");
                break;
            case "august":
                System.out.println("31 days");
                break;
            case "september":
                System.out.println("30 days");
                break;
            case "october":
                System.out.println("31 days");
                break;
            case "november":
                System.out.println("30 days");
                break;
            case "december":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month name");
        }

        sc.close();
    }
}