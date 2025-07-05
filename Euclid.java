//this euclid method is used to find the gcd and lcm in best time complexity
import java.util.Scanner;
public class Euclid {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    static int lcm(int a,int b){
        int lcm=(a*b)/gcd(a,b);
        return lcm;
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("LCM is "+lcm(a,b));
        System.out.println("GCD is "+gcd(a,b));
    sc.close();
    }
    
}
