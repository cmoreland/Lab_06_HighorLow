import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        boolean done = false;
        do {
            int compNum = ran.nextInt(1, 11);
            System.out.println("I am thinking of a number between 1 and 10. What would you guess that number is? ");
            if (in.hasNextInt()) {
                int userNum = in.nextInt();
                in.nextLine();
                if (userNum > 0 && userNum < 11) {
                    if (userNum < compNum) {
                        System.out.println("My number was higher than that! It was " + compNum + ". You lose!");
                        done = true;
                    } else if (userNum > compNum) {
                        System.out.println("My number was lower than that! It was " + compNum + ". You Lose!");
                        done = true;
                    } else {
                        System.out.println("That was my number! It was " + compNum + ". You win!");
                        done = true;
                    }
                }
                else {
                    System.out.println("Enter a number between 1 and 10");
                }
            }
            else {
                String trash = in.nextLine();
                System.out.println("You said " + trash + ". That's not the right format. Try again.");
            }
        }while (!done);
    }
}