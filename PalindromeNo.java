//palindrome:   original == reverse
import java.util.Scanner;
public class PalindromeNo {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int original=number;
         int reverse=0;

        while(number>0){
            int digit=number%10;// it gets the remainder value (121%10=1)
            reverse=(reverse*10)+digit;//((0*10)+1)
            number=number/10;//(121/10=12)-------again it gets loop so we can reduce the value and reach the end value
            

        }
        String result=(reverse==original)?"Palindrome":"Not a Palindrome";
        System.out.println(result);
    }
    
}
