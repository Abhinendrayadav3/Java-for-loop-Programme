import java.util.Scanner;

public class checkevenOrodd {
    static void check(int num){
    

        if (num%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        check(num);
    }
}
