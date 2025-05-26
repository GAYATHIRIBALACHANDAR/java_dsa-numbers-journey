import java.util.Scanner;
public class PrimeNo {
    public static void main(String []args){
        System.out.println("Enter the number to check whether it is prime or not:");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        boolean isprime=true;
        if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                     result=1;
                
                break;
                }
                
            }
            if (result==1){
                System.out.println("The given no is not prime");
            }
            else{
                System.out.println("The given no is prime");
            }
        }
        // using the square root function
        for (int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i ==0){
                isprime=false;
                break;
            }

        }
        String result2=(isprime==false)?"The given number is not prime ":"The given number is prime";
        System.out.println(result2);
sc.close();
    }
   
}
