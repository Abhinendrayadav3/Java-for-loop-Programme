class human{
    private int height;
    private int weight;
    private String gender;
    int x;
    public int getHeight(){
        return height;
    } 
    public int getWeight(){
        return weight;
    }
    public String getGender(){
        return gender;
    }
    public void setHeight(int Nheight){
        this.height=Nheight;
    }
    public void setWeight(int newWeight){
        this.weight=newWeight;
    }
    public void setGender(String newGender){
        this.gender=newGender;
    }
public class encap1 {
}
public static void main(String [] args){
    human mySpecify=new human();
    mySpecify.setHeight(194);
    mySpecify.setGender("Male");
    mySpecify.setWeight(73);
    System.out.println("the gender of human is:"+mySpecify.getGender());
    System.out.println("the Height of human in Cms is:"+mySpecify.getHeight());
    System.out.println("the Weight of human is:"+mySpecify.getWeight()+"Kg");


}
}
