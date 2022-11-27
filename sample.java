class dog{
    String breed;
    String gender;
    public void info(){
        System.out.println(this.breed);
        System.out.println(this.gender);
    }
}


public class sample {
  public static void main(String[] args) {
        dog animal1=new dog();
        animal1.breed="labra dog";
        animal1.gender="male";
        animal1.info();
    }
}
