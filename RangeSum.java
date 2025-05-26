import java.util.Scanner;
public class RangeSum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the initial number:");
        int initialno=sc.nextInt();
        System.out.println("Enter the ending number:");
        int endno=sc.nextInt();
        //recursive method
        System.out.println( "by using recursive method:"+ getsum(initialno,endno));

        int sum=0;
        //-----------brute force method----------
        for(int i=initialno;i<=endno;i++){
         sum= sum+i;

        }
        System.out.println("by using brute force method:"+sum);
        //------------formula method-----
        int result= ((endno*(endno+1))/2)-(initialno*(initialno+1)/2) +initialno;
        System.out.println("by using fomula method:"+result);
        sc.close();
    }

static int getsum(int initialno,int endno){
    if(initialno > endno){
        return 0;

                         }
    else{
        return initialno+getsum(initialno+1, endno);
        }
}
}