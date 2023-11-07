import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Year Number To Check Leap Year Or Not :");
        int year = scanner.nextInt();
        if (year > 999)
            if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
                System.out.println("Year " + year + "is Leap Year");
            else
                System.out.println("Year " + year + "Is Not Leap Year");
        else
            System.out.println("You Are NOt Entering The 4 Digit Number");
    }
}
