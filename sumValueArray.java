public class sumValueArray {
    public static void main(String[] args) {
        int[] val={6754,23,645,23,12,75,12};
        int count=0;
        for(int i=0;i<val.length;i++){
            count=count+val[i];
            System.out.println(count);
        }
    }
}
