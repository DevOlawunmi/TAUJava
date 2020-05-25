package chapter3a;
/*
This is different from the if else if statement in that
the if else if checks that a condition is true
whilst the switch statement checks for equality
 */

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade){
            case "A" : message = "Excellent job";
            break;
            case "B" : message = "Good job";
            break;
            case "C" : message = "Not bad";
            break;
            case "D" : message = "You need to work harder";
            break;
            default: message = "You either failed this course or entered an invalid grade";
        }
        System.out.println("Your grade is  " + grade +" " + message);
    }
}
