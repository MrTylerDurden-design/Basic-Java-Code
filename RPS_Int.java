
import java.util.Scanner;
import java.util.Random;

public class RPS_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Show choices
        System.out.println("Choose: 0 = Rock, 1 = Paper, 2 = Scissors");
        int userMove = sc.nextInt();  // user enters 0, 1, or 2

        int computerMove = rand.nextInt(3); // random 0, 1, or 2

        System.out.println("Computer chose: " + computerMove);

        if (userMove == computerMove) {
            System.out.println("It's a draw!");
        } else if (
            (userMove == 0 && computerMove == 2) || // Rock beats Scissors
            (userMove == 1 && computerMove == 0) || // Paper beats Rock
            (userMove == 2 && computerMove == 1)    // Scissors beats Paper
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}

    

