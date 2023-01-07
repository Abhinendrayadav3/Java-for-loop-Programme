class car{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;

    }
}
public class encap {
    public static void main(String[] args) {
        car myObj=new car();
        myObj.setName("Porsche");
        System.out.println(myObj.getName());
    }
}
