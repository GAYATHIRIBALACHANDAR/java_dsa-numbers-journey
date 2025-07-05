//need to find the factorial of the number and find factorial have trailing zeros(which means last how many digit is zero)
import java.util.Scanner;
public class Trailingzeros {
    //check the trailing zeros value
    static int trailingzero(int n){
       int no= fact(n);
        int count=0;
        while(no!=0){
            if(no%10==0){
                count++;
                no=no/10;
            }
            else{
                break;
            }
        }
        return count;
    }
    //finding factorial no
    static int fact(int n){
        int fact=1;
        if(n==0){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                fact*=i;

            }
            return fact;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

       int res= trailingzero(no);
        System.out.println((res));
        sc.close();
    }
    
}
