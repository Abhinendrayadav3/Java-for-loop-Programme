import java.util.*;

public class ll2O{
    public static void main(String[] args) {
        LinkedList <String> ll=new LinkedList<>();
        ll.add("hello");
        ll.add("you");
        ll.add(1,"2");

        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i) + " ");
        }
    }
}