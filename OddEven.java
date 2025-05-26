import java.util.Scanner;



public class OddEven {
    public static void main(String []args){
        System.out.println("Enter the number to check odd or not:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
         String result= (num%2==0)?"The given number is even":"The given number is odd";
         System.out.println(result);
         sc.close();
    }
}