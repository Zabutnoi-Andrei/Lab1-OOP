package main.java;


import java.util.Scanner;

public class Game  {

    Boolean quit;
    Player1 player1 = new Player1();
    Player2 player2 = new Player2();


    Game() {
        quit = true;
    }

    void intoGame() {
        String p;

        do {
            int a = (int) (2 + Math.random() * 10);
            int b = (int) (2 + Math.random() * 10);

            Scanner s = new Scanner(System.in);
            p = s.nextLine();

            switch(p){
                case "q":
                    System.out.println("Have a nice day. Goodby");
                    quit = false;
                    break;
                case "a":
                    System.out.println("Hi my dear Players " + "Present yourself");
                    player1.talk();
                    player2.talk();
                    break;
                case "c":
                    System.out.println("Player1: "+ a +"    "+ "Player2: " + b);

                    if (a<b) {
                        player1.talk(true);
                        player1.Score(player1);


                    }
                    else {
                        player2.talk(true);
                        player2.Score(player2);
                    }
                    break;

                default:

                    break;



            }





            }
            while (quit == true ) ;
            {

                //player1.talk();
                /*} else {
                    player2.talk();
                }

            }
            else {
                System.out.println("lol");

            }*/


            }
        }
    }
