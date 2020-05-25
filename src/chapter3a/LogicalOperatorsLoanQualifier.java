package chapter3a;

import java.util.Scanner;

public class LogicalOperatorsLoanQualifier {
    public static void main(String[] args) {
        int minimumSalary = 3000;
        int minimumService = 24;

        System.out.println("Please enter your salary");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        System.out.println("Please enter how long you have worked with the company");
        int lengthOfService = scanner.nextInt();

        if (salary >= minimumSalary && lengthOfService >= minimumService)
        {
            System.out.println("You qualify for a loan");
        }
        else System.out.println("Sorry you do not qualify");

    }
}