import java.util.Scanner;
 
public class GuessingGame {
 

    public static void
    guessingNumberGame()
    {

        Scanner sc = new Scanner(System.in);
 

        int number = 1 + (int)(100
                               * Math.random());
 

        int K = 5;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");
 
  
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
      
            guess = sc.nextInt();
 
         
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
  