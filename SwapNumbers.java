import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int firstNum = swap.nextInt();
        System.out.println("Enter The Second Number:");
        int secondNum = swap.nextInt();
        System.out.println("--Before swap--");
        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);
        int temp ;
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("--After swap--");
        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);
    }
}
