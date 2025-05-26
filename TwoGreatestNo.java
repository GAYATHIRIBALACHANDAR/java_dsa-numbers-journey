import java.util.Scanner;

public class TwoGreatestNo {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        if(num1 == num2){
            System.out.println("Both are equal");
        }
         else 
         {String result=num1 > num2 ? "The number1 " +num1+ " is greatest": "The number2 " +num2+ " is greatest";
        System.out.println(result);}

        sc.close();
        }
    
}
