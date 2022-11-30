import java.util.ArrayList;
import java.util.Collections;

class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        
        //add items
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        //getting the items
        int ele =list.get(1);//index give
        System.out.println(ele);

        //setting the element
         list.set(0,5);
         System.out.println(list);
        
         //getting the size of the list
         int size=list.size();
         System.out.println(size);

         //loops
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));

         }
         System.out.println();

         //sorting
         Collections.sort(list);
         System.out.println(list);
    
        
    }
}