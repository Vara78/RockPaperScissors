package pack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running  = true;
        int userScore = 0;
        int computerScore = 0;

        do {
            int computer = (int) (Math.random() * 3);

            System.out.println("_________________");
            System.out.println("Enter..." +
                    "\n0 for Rock" +
                    "\n1 for Paper" +
                    "\n2 for Scissors");
            System.out.print("Enter a choice: ");
            int user = input.nextInt();
            System.out.println();

            if (user == 0 && computer == 0) {
                System.out.printf("|User: Rock vs Rock :Computer|");
                System.out.println("\n          Drawl!");
            } else if (user == 0 && computer == 1) {
                System.out.printf("|User: Rock vs Paper :Computer|");
                System.out.println("\n      Computer Wins!");
                computerScore++;
            } else if (user == 0 && computer == 2) {
                System.out.printf("|User: Rock vs Scissors :Computer|");
                System.out.println("\n         You Win!");
                userScore++;
            } else if (user == 1 && computer == 0) {
                System.out.printf("|User: Paper vs Rock :Computer|");
                System.out.println("\n          You Wins!");
                userScore++;
            } else if (user == 1 && computer == 1) {
                System.out.printf("|User: Paper vs Paper :Computer|");
                System.out.println("\n           Drawl!");
            } else if (user == 1 && computer == 2) {
                System.out.printf("|User: Paper vs Scissors :Computer|");
                System.out.println("\n       Computer Wins!");
                computerScore++;
            } else if (user == 2 && computer == 0) {
                System.out.printf("|User: Scissors vs Rock :Computer|");
                System.out.println("\n         Computer Wins!");
                computerScore++;
            } else if (user == 2 && computer == 1) {
                System.out.printf("|User: Scissors vs Paper :Computer|");
                System.out.println("\n             You Win!");
                userScore++;
            } else if (user == 2 && computer == 2) {
                System.out.printf("|User: Scissors vs Scissors :Computer|");
                System.out.println("\n              Drawl!");
            } else {
                System.out.println("Error: Wrong entry; try again!");
            }

            System.out.printf("\n    Your Score: %S \nComputer Score: %s\n", userScore, computerScore);
        } while(running);
    }
}
