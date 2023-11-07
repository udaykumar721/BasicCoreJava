import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number To Check Even or Odd");
        int number = scanner.nextInt();
        if (number % 2 ==0)
            System.out.println("Given Number Is An Even Number");
        else
            System.out.println("Given Number Is An Odd Number");
    }
}
