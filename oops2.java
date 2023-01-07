// Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:


class carSpecific{
    public void fullThrottle(int T){
        System.out.println("The car throttle is:" +T);
    }
    public void speed(int kmph){
        System.out.println("The max speed of the car is:" +kmph);

    }
}
public class oops2 {
    public static void main(String[] args) {
        carSpecific myCar=new carSpecific();
        myCar.fullThrottle(483);
        myCar.speed(873);
    }
}
