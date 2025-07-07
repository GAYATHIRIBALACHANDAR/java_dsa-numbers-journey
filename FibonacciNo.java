import java.util.Scanner;
public class FibonacciNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no=sc.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        System.out.print(" "+a+ " "+b);
        for(int i=2;i<no;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp+" ");

        }

sc.close();
    }
    
}
