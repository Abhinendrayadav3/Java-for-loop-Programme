public class swap2num {
    static void swap(int a,int b ){
    int temp=a;
    a =b;
    b= temp;
    System.out.println("the value of a is "+a +"and B is "+b);
    }
    public static void main(String[] args) {
        int a=5, b=10;
        swap(a,b);
        
    }
}
