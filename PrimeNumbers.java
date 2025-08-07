import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int j = 2; j * j <= n; j++) {
            if (isPrime[j]) {
                for (int i = j * j; i <= n; i += j) {
                    isPrime[i] = false;
                }
            }
        }
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}