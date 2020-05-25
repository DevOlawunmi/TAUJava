package chapter3a;
/*
*********Used when more than 2 situation occurs*****************
If situation A occurs, <do something>
else if situation B occurs <do something else>
else if situation C occurs <do something else>
*
Display a letter grade for students based on their test score
 */

import java.util.Scanner;

public class IfElseIfStatements {
    public static void main(String[] args) {

char grade;
        System.out.println("Please enter your score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score < 50) {
            System.out.println("You are to resit this course");
        } else if (score < 60) {
            System.out.println("You have earned a C");
        } else if (score < 70) {
            System.out.println("You have earned a B");
        } else {
            System.out.println("You have earned an A");
        }
    }
}