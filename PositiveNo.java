import java.util.Scanner;
public class PositiveNo{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check the given number is positive or negative:");
        int num=sc.nextInt();
        String result = (num > 0) ? "The given number is positive" :(num ==0) ? "The given number is zero" :"The given number is negative";
        System.out.println(result);
        sc.close();
    }
}