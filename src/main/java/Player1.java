package main.java;

//import main.java.ExamplePlayer;

import java.util.Random;

// inheritance
public class Player1 extends ExamplePlayer {

    public Player1(){
        super("Player1", 100);
    }




    @Override
    public void talk(){
        System.out.println("I'm " + super.getName() + " I have " + super.getPoints() + " points" );
    }

    @Override void talk(Boolean b){
        System.out.println("Player 1 : O.M.G, I CAN'T LOST");
    }




}
