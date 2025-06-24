import java.util.Scanner;
public class MaxMinElementArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in an array:");
        short count=sc.nextShort();
        System.out.println("Enter the elements for the array: ");
        short [] array= new short[count];
        for(int i=0;i<count;i++){
            array[i]=sc.nextShort();
           
        }
    //     System.out.println("The entered array elements are: ");
    //    for (int i=0;i<count;i++){
    //     System.out.print(array[i]+" ");
    //    }
    short large=array[0];
        for(int i=1;i<array.length;i++){
             
             if(array[i]>large){
                large=array[i];
             }

        }
        System.out.println("The largest element from the given array "+large);
    short min=array[0];
        for(int i=1;i<array.length;i++){
             
             if(array[i]<large){
                large=array[i];
             }

        }
        System.out.println("The smallest element from the given array "+min);   
        
        sc.close();
    }
}
