import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int width=sc.nextInt();
        if(height<=0 || width<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(height*width);
        }
        
    }
}
