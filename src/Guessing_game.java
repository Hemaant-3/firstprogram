import java.util.Random;
import java.util.Scanner;
/*
Guessing Number Game
 */
class Game {
   private final int random_NO;
    private int userInput;
    private int NoOfGuess=0;

    public void setUserInput(int inp) {
        // set the user input
        userInput = inp;
    }
    public int getRandom_NO(){
        return random_NO;
    }
    public int getNoOfGuess(){
        return NoOfGuess;
    }

    public int isCorrect() {
        NoOfGuess++;
        if (random_NO == userInput) {
            System.out.println("You Guess the right number");
            return NoOfGuess;
        }else if (random_NO>userInput){
            System.out.println("You guess the small number");
        } else {
            System.out.println("You guess the large number");
        }
        return 0;
    }

    public Game() {
        // to generate the random number.
        Random random = new Random();
        random_NO = random.nextInt(100);
    }

}

public class Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Create a class Game, which allow a user to play "Guess the Number"
        game once. Game should have the following methods.
        1. constructor to generate the random the numbers
        2. takeUserInput() to a user input of number.
        3. isCorrectNumber() to detect wether a number is entered by user is true
        4. getter and setter for noGuesses
        use properties such as noOfGuesses(int), etc to get this task done/
        */

        System.out.println("Welcomne to Game!!!!");
        Game player1 = new Game();
        System.out.println("Guess the number between 1 to 100");
//        System.out.println(player1.getRandom_NO());
        int x;
       do {
           player1.setUserInput(sc.nextInt());
          x = player1.isCorrect();
           }while (x==0);
        System.out.println("The number of guesses you take is: "+player1.getNoOfGuess());
    }
}
