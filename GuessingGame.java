import java.util.Scanner;

public class GuessingGame {
    public void guess() {
        int guessedNumber = (int) (Math.random() * 100);
        System.out.println("I have randomly chosen a number between [1, 100]");
        System.out.println("Try to guess it");
        
        int userInput = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            if (guessedNumber < userInput) {
                System.out.println("It's lesser than " + userInput + ", Try again");
                System.out.println("You have " + (10 - i) +  " guess(es) left");
                userInput = scanner.nextInt();
            } else if (guessedNumber > userInput) {
                System.out.println("It's greater than " + userInput + ", Try again");
                System.out.println("You have " + (10 - i) + " guess(es) left");
                userInput = scanner.nextInt();
            } else {
                System.out.println("CORRECT...!!, "+ userInput +" YOU WIN! ");
                break;
            }
        }
        scanner.close();
    }
}
