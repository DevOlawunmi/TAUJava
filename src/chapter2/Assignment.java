package chapter2;

import java.util.Scanner;

//Create a programme that asks the user for a season of the year, then a whole number, then an adjective
//On a [adj][season] day, I have [whole number] cups of coffee
public class Assignment {
    public static void main(String[] args) {
        //1. Get the adjective
        System.out.println("Enter an adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective  = scanner.next();
        //2. Get the season
        System.out.println("Enter a season");
        String season = scanner.next();
        //3. Get the number of coffee
        System.out.println("Enter number of coffee");
        int coffee = scanner.nextInt();
        scanner.close();
        System.out.println("On a " + adjective +" " + season +" day, I have "+ coffee + " "+ "cups of coffee");

    }
}
