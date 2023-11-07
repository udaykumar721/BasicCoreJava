import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The first Number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter The Second Number");
        int secondNum = scanner.nextInt();
        System.out.println("Enter The Third Number");
        int thirdNum = scanner.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum)
            System.out.println("First Number Is Largest Number and Number Is :" + firstNum);
        else if (secondNum > firstNum && secondNum > thirdNum)
            System.out.println("Second Number Is Largest Number And Number Is:" + secondNum);
        else
            System.out.println("Third Number Is Largest Number And Number Is" + thirdNum);
    }
}
