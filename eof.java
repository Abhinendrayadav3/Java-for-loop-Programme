
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = 1;

        while (scanner.hasNextLine()) {
            System.out.println(lines + " " + scanner.nextLine());
            lines++;
        }
        scanner.close();
    }
}
