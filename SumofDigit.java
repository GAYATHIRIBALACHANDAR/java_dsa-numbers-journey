import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
         int sum=0;
        //checking whether the number is greater than 0
        while(number>0){
           
            int digital=number%10;
            sum+=digital;
            number=number/10;
        }
        System.out.println(sum);
    }
}