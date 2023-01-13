class games{
    public String multiPlay;
    public String getMultiplay(){
        return multiPlay;
    }
    public void setMultiplay(String multiPlay){
        this.multiPlay=multiPlay;
    }
}   

class pubg extends games{

}
public class inherti1 {
    public static void main(String[] args) {
        //objects of base classs
        games s1=new games();
        s1.setMultiplay("yes the game should be multiplayer");
        System.out.println(s1.getMultiplay());

        //object of derived class
        pubg p1=new pubg();
        p1.setMultiplay("Yes pubg is a multiplayer game");
        System.out.println(p1.getMultiplay());
    }
    
}
