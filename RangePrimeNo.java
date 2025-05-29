 import java.util.Scanner;

public class RangePrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value:");
        int initial = sc.nextInt();
        System.out.println("Enter the ending value:");
        int end = sc.nextInt();

        System.out.println("Prime numbers in the given range:");
        for (int i = initial; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    // Corrected prime check method
    static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
