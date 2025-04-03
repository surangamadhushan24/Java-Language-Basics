package numberGuessingGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your game level: easy, medium, hard: ");
        String gameLevel = sc.next();
        int loopValue = 0;
        int count = 0;
        int guessNumber = 0;

        int min = 1;
        int max = 100;
        int rangeRandom = min + (int)(Math.random() * ((max - min) + 1));


        switch (gameLevel.toLowerCase()){
            case("easy"):
                loopValue = 10;
                break;

            case("medium"):
                loopValue = 5;
                break;

            case("hard"):
                loopValue = 3;
                break;

        }


        while(count < loopValue) {

            System.out.println("Guess number in 1 - 100: ");
             guessNumber = sc.nextInt();

            if(guessNumber == rangeRandom){
                System.out.println("you are win");
                break;
            } else if (guessNumber > rangeRandom) {

                System.out.println("too high! try again");

            } else {
                System.out.println("too Low! try again");
            }
            count ++;

        }

     if(guessNumber != rangeRandom){
         System.out.println("you are lost!!!");
     }




    }
}
