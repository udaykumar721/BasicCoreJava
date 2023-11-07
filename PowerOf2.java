import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int N = scanner.nextInt();
        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30 to avoid integer overflow.");
        } else {
            System.out.println("Powers of 2 up to 2^" + N + ":");
            int power = 1;
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + power);
                power = power * 2;
            }
        }
    }
}

