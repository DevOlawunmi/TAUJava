package chapter3a;
/*
All sales people are expected to make to make 10 sales a week
If they do, they get a congratulatory message, if not they are told they don't get a bonus.
 */

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int expectedSales = 10;
        // get number of sales
        System.out.println("Please enter the number of sales for the week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= expectedSales) {
            System.out.println("Congratulations!! You get a bonus");

        } else {
            System.out.println("Unfortunately you this not meet this week's quota");
        }
    }
}