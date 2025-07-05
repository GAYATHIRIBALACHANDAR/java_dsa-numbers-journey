import java.util.*;
public class LCM {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=a>b?a:b;
        while(true){
            if(max%a==0 && max%b==0){
                break;
            }
            max++;
        }
        System.out.println(max);

        
    }
    
}
