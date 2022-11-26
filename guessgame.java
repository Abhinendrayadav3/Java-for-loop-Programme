
import java.util.Scanner;

public class guessgame {

    public static void main(String[] args) {
      int myNum=(int)(Math.random()*100);
      Scanner sc=new Scanner(System.in);
      int userNumber=0;
      System.out.println("To exit the game type -1");

      do{
        System.out.println("Guess the number(0-100)");
        userNumber=sc.nextInt();

        if(userNumber==-1){
            System.out.println("Unfortunately you quit the Game");
            break;}
        else if(userNumber==myNum){
            System.out.println("Wohooo.. you have guessed it correctly");}
        else if(userNumber>myNum){
            System.out.println("Your number is too big please again");
        }
        else if(userNumber<myNum){
            System.out.println("Your number is too small please again");
        }
        
        
    }while(userNumber>=0);
    System.out.print("Correct Number is: ");
    System.out.print(myNum);
}


}
