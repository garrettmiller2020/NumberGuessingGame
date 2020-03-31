package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game.");
        System.out.println("Here are the rules!");
        System.out.println("First, I pick a number and then you try to guess it.");
        System.out.println("The number that I pick will be between 1 and 100.");
        System.out.println("If you guess lower than my number, I will let you know that you guessed too low,");
        System.out.println("and if you guess higher than my number, I will let you know that you guessed too high.\n" +
                "\n");
        System.out.println("Time To Play!" +
                "\n");

        Scanner scanner = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int) (Math.random() * 100 +1);
            int guess = 0;
            int count = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                count++;
                if (guess < theNumber) {
                    System.out.println(guess + " is too low.");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high.");
                } else {
                    System.out.println(guess + " is correct.");
                    System.out.println("Nice job on guessing the number in " + count + " tries. Well Done!");
                }
            }
            System.out.println("Would you like to play again? (yes or no)");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase(("yes")));
        System.out.println("Thank for playing! Have a great day.");
        scanner.close();
    }
}
