package main.java;
import java.lang.Math;
/*
An abstract class is something which is incomplete and you can not
create an instance of the abstract class. If you want to use it
you need to make it complete or concrete by extending it.
 */

public abstract class ExamplePlayer {

    private String name;
    private int points;
    private boolean isLost = false;


    public ExamplePlayer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void Score(ExamplePlayer ep) {
        int score = 20;

        ep.calcScore(score);

        System.out.println(ep.name + " have " + points);
    }

    public void calcScore(int score) {
        if(points - score <= 0) {
            points = 0;
            System.out.println(" Game over ");

        } else {
            points -= score;
        }
    }


    abstract void talk();

    abstract void talk(Boolean b);

    public String getName(){
        return name;
    }

    // getter (encapsulation)
    public int getPoints(){
        return points;
    }

    public boolean isLost() {
        return isLost();
    }



}
