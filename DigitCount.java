//used to find the total count of number
import java.util.Scanner;

public class DigitCount {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp=Math.abs(num);//it is used for not changing the original value
        int count=0;
        if(temp==0){
            System.out.println("the total count is: 1");

        }
        else{
            while(temp>0){
                temp=temp/10;
                count++;
                /*
                 NO=153
                  iteration=1:
                 temp=temp/10
                     =153/10 =>15.3 =>15
                     count 0+1 =>1

                     iteration=2:
                 temp=temp/10
                     =15/10 =>1.5 =>1
                     count 1+1 =>2

                     iteration=3:
                 temp=temp/10
                     =1/10 =>0.1 =>0
                     count 2+1 =>3

                 */

            }
            System.out.println("the total count is:"+count);
        }
        sc.close();
    }
    
}
