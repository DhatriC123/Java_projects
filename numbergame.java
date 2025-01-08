import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Random rand=new Random();// create a random obj
        int randomNumber = rand.nextInt(100) + 1;
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        int attempts=0;
        int max_attempts=10;

        while(attempts<max_attempts){
        System.out.print("Enter your guess: ");
        attempts=attempts+1;
        int guess = scanner.nextInt(); 
        if(guess==randomNumber){
            System.out.println("correct");

        }else if(guess<randomNumber){
            System.out.println("Too low");
        }
        else{
            System.out.println("Too high");

        }
    }
    System.out.println("Attempts Done, sorry");

        // Close the scanner
        scanner.close();
    }
}

