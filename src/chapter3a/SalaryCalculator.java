package chapter3a;
/*
If statements
All salespeople get £10000 a week, salespeople who exceed 10 sales get a bonus of £250
1. Get the number of sales
2. Write a statement that adds the bonus if the number of sales is greater than 10
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 10000;
        int quota = 250;
        System.out.println("Enter the number of sales this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales > 10)
        {salary = salary +quota;}
        System.out.println("You have earned "+ salary);
        }
    }
