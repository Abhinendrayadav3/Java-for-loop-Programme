public class ll2O{
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.add(0);
        ll.add(9);
        ll.add(1,'for');

        for(int i=0;i<ll.size();i++){
            system.out.print(ll.get(i),+' ');
        }
    }
}