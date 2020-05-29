package chapter3a;
/*
The objective of the game is to enter enough change to equal £2.
Create a programme that asks the users to enter quantities of £1, 50p, 20p and 10p
The programme should count up the total of all the change. If it is exactly £2, they win
If it's more, tell them by how much they went over, if less tell them by how much they are short

 */

import java.util.Scanner;

public class Attempt1ChangeForTwoPoundsGame {
    public static void main(String[] args) {

        // Initialise what we know
        //Get user input
        int targetAmount = 2;
        int exactFiftyP = 4;
        int exactOnePound = 2;
        int exactTwentyP = 10;


        System.out.println("How many one pound coins?");
        Scanner scanner = new Scanner(System.in);
        int onePoundQuantity = scanner.nextInt();
        System.out.println("How many fifty p coins?");
        int fiftyPQuantity = scanner.nextInt();
        System.out.println("How many twenty p coins?");
        int twentyPQuantity = scanner.nextInt();
        if (onePoundQuantity == exactOnePound || fiftyPQuantity == exactFiftyP || twentyPQuantity == exactTwentyP) {
            System.out.println("You have exactly £" + targetAmount + " Happy days!!!" );
        } else {
            System.out.println("You don't have exactly £" + targetAmount + " try again!");


        }
    }
}
