import java.util.Random;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        //initialize
        int minValue, maxValue, randomValue, userGuess;

        Scanner userInput = new Scanner(System.in);         //calling scanner class for user input
        Random random = new Random();                       //calling random class for randoming number purpose

        minValue = 0; maxValue = 10;                        //setting the min and max value of generated random number
        randomValue = random.nextInt(minValue, maxValue);   //getting a random number from 0 to 10

        System.out.println("Welcome to Cosmic' Number Guessing!");
        System.out.println("Please pick a number from range 0 to 10");
        System.out.print("Number guess : ");
        userGuess = userInput.nextInt();                    //getting input from user

        //checking the user answer
        if(userGuess == randomValue){
            System.out.printf("Your answer was correct! the correct number were %d\n", randomValue);
        } else{
            System.out.printf("Your answer was wrong! the correct number was %d\n", randomValue);
        }
            
    }
}
