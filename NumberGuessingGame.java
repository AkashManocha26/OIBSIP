
import java.util.*;

public class NumberGuessingGame {

    public static void guessnumber() {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        Random ran = new Random();
        System.out.println("NUMBER GUESSING GAME (Choose a number b/w 1-100)");
        int n = ran.nextInt(max);
        System.out.println("LET'S GOO! You have 7 chances");
        for (int i = 1; i < 8; i++) {
            System.out.println("CHANCE-"+i);
            int a = sc.nextInt();
            if (a == n) {
                System.out.println("HURRAY!! You Won");
                System.exit(0);
            } else if (a > n) {
                System.out.println("Guessing number is greater than the random number");
            } else {
                System.out.println("Guessing number is less than the random number");
            }
        }
        System.out.println("You LOST, Correct number is "+n);

    }

    public static void main(String[] args) {

        guessnumber();
    }
}