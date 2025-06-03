import java.util.Scanner;

public class SumNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        // 1. Recursive method
        System.out.println("Using Recursion: " + getSum(num));

        // 2. Using loop
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Using Loop: " + sum);

        // 3. Using formula
        int result = (num * (num + 1)) / 2;
        System.out.println("Using Formula: " + result);

        sc.close();
    }

    // Recursive function
    static int getSum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + getSum(num - 1);
        }
    }
}
// output: number:10; output:55
