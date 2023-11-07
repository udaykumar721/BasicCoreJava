import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, headsCount = 0, tailsCount = 0;
        double heads, tails;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter no of times you want to flip the coin: ");
        n = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                tailsCount++;
            else
                headsCount++;
        }
        heads = headsCount / (double) n * 100;
        tails = tailsCount / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");
    }
}