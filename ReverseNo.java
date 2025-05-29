
import java.util.Scanner;
public class ReverseNo {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();     //1234
        int reverse=0;
        while(no!=0){
            int digit = no%10; //1234%10 = 4
            reverse= (reverse*10)+digit;  //(0*10)+4=4
            no=no/10;//(1234)/10=123.4=123(next 123 pass and then this process is applied for that)


        }
        System.out.println(reverse);
        sc.close();
    }
    
}
