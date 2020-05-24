package chapter3a;
/*
********************If a certain situation occurs, check for the next situation*****************
To qualify for a loan, a person must make at least £30000
and have been working on their job for 2 years
 */

import java.util.Scanner;

public class NestedIfStatementsLoanQualifier {
    public static void main(String[] args) {
// Get how much they earn
        int requiredSalary = 30000;
        int requiredService = 24;
        System.out.println("Please enter current salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        // Get how long they've been with the company for in months
        System.out.println("Please enter in months how long you have been with the company");
        int lengthOfService = scanner.nextInt();
        scanner.close();

        if (salary >= requiredSalary) {
            if (lengthOfService >= requiredService) {
                System.out.println("Congratulations, you qualify for a loan");
            } else {
                System.out.println("Unfortunately, you do not yet qualify for a loan due to LOS");
            }
        } else {System.out.println("Unfortunately you do not qualify, up your salary");}
    }
}