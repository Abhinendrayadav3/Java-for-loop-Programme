import java.util.Scanner;
import java.util.Arrays;

public class largestamg3 {
    public static void main (String args[]){
        int m;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements u want to store");
        m=sc.nextInt();
        int [] arr=new int[10];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the inputed elements are");
        
        for(int i=0;i<m;i++){
            System.out.println(arr[i]);
        }
        

        
        



    }
    
}
