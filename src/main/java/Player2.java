//import main.java.ExamplePlayer;
package main.java;
// Inheritance is mainly used for code reusability
public class Player2 extends ExamplePlayer {

    public Player2(){
        super("Player2", 100);

    }

    @Override
    public void talk(){
        System.out.println("I'm " + super.getName() + " I have " + super.getPoints() + " points");
    }

    @Override
    public void talk(Boolean b){
        if(b){
            System.out.println(" Player 2 : Fuck , i have lost");
        }
    }








}
