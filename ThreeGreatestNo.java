import java.util.Scanner;
public class ThreeGreatestNo {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1= sc.nextInt();
         System.out.println("Enter the number2");
        int num2= sc.nextInt();
         System.out.println("Enter the number3");
        int num3= sc.nextInt();
        int temp= num1>num2? num1:num2;
        int result= temp>num3? temp: num3;
        System.out.println("The biggest number among the given three numbers"+num1+", "+num2+" ,"+num3+ " are "+ result);
        sc.close();
    }
    
}
