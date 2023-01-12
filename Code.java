import java.util.Random;
import java.util.Scanner;

public class Testfield {
    public static void main(String[] args) throws IllegalArgumentException {
        //initialize
        int minValue, maxValue, randomValue, userGuess, userLife;

        Scanner userInput = new Scanner(System.in);   //calling scanner class for user input
        Random random = new Random();   //calling random class for randoming number purpose
        
        //getting random number guessing range and random answer of the guessing number
        minValue = 0; maxValue = 100;
        randomValue = random.nextInt(minValue, maxValue);

        minValue = randomValue;

        maxValue = 100;
        randomValue = random.nextInt(minValue, maxValue);
        
        maxValue = randomValue;   //setting the min and max value of generated random number
        randomValue = random.nextInt(minValue, maxValue);   //getting a random number from 0 to 10
        
        userLife = 3;

        System.out.println("Welcome to Cosmic' Number Guessing!");
        System.out.printf("Please pick a number from range %d to %d\n", minValue, maxValue);
        System.out.printf("Remaining life : %s\n", userLife);
        
        while(userLife != 0){
            System.out.print("Number guess : ");
            userGuess = userInput.nextInt();    //getting input from user

            //checking the user answer
            if(userGuess == randomValue){
                System.out.printf("Your answer was correct! the correct number was %d\n", randomValue);
                break;
            }
            else if(userGuess == 101){
                System.out.printf("Random number : %d\n\n", randomValue);
            }
            else if(userGuess == 102){
                userLife ++;
                System.out.printf("Life added +1 : %s\n\n", userLife);
            } 
            else if(userGuess == 00){
                break;
            }
            else{
                System.out.printf("\nYour answer was wrong! try again!\n\n");
                userLife = userLife - 1;
                System.out.printf("Remaining life : %s\n", userLife);

            if(userLife == 0){
                System.out.printf("You failed! The right answer was %d\n", randomValue);
            }
        }
        
        }
            
    }
}
