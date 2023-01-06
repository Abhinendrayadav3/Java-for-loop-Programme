import java.util.Arrays;
public class sortingArray{
    public static void main(String[] args) {
        int[] num={56,32,96,12,45};
        Arrays.sort(num);
        System.out.println("the sorted arrays are");
        for(int i:num){
            System.out.println(i+" ");
        }
        String [] alpha={"Z","G","Q","R","T","H"};
        Arrays.sort(alpha);
        System.out.println("The sorted Strings are:");
        for(String s:alpha){
            System.out.println(s);
        }
    }
}