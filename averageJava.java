public class averageJava {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int leno=arr.length;
        int sunm=0;
        for(int i=0;i<arr.length;i++){
            sunm=sunm+arr[i];
            

        }
        System.out.println(sunm/leno);
    }
}


