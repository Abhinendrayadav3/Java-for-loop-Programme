class animal{
    public void sound(){
     System.out.println("animal makes sound");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("the dog make bow bow");
    }
}
class cat extends animal{
    public void sound(){
        System.out.println("the cat makes meow meow");
    }
}
public class pol1 {
    public static void main(String [] args){
    animal myAnimal=new animal();
    cat myCat=new cat();
    dog myDog=new dog();
    myAnimal.sound();
    myDog.sound();
    myCat.sound();
    }
    
}
