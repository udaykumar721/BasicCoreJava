import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (N should be a positive integer): ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("N must be a positive integer greater than 0.");
        } else {
            double harmonicValue = calculateHarmonicNumber(N);
            System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);
        }
    }
    public static double calculateHarmonicNumber(int N) {
        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue = harmonicValue + 1.0 / i;
        }
        return harmonicValue;
    }
}

