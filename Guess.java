import java.util.Random;
import java.util.Scanner;

public class Guess {
        public static void main(String[] args) {

            int score = 0;

        Random rand = new Random();
        Scanner scan = new Scanner (System.in);

        System.out.println("Pick a number between 1-100");
        int pickNumber = scan.nextInt();
        int randomNumber = rand.nextInt(100) + 1;

        int difference = Math.abs(pickNumber - randomNumber);

        if (difference == 0){
            System.out.println("Your score is 100"); 
        }
            if (difference > 0 && difference < 25){
                System.out.println("Your score is 50");
            }
                if (difference > 25){
                    System.out.println("Your score is 10");
                }

	}
}
