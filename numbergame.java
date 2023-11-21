import java.util.*;
public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 10;

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Guessing Game");
            System.out.println("i hava selected a number between " + minRange + " and " + maxRange + " . Try to guess it!");


            int attempts = 0;
            while (attempts < maxAttempts ) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if(userGuess < targetNumber){
                    System.out.println("Too low! Try again.");

                } else if (userGuess > targetNumber){
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! you guessed the number " + targetNumber + " in " + attempts);
                    score += maxAttempts - attempts + 1;
                    break;
                }

            } 
             
            if (attempts == maxAttempts){
                System.out.println("sorry, you've reached the maximum number of attempts. The correct number between 1 to 100 you guess it");

            }
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");

              
            
        }
        System.out.println("Thanks for playing! Your total score is: " + score);
    }

    
}
