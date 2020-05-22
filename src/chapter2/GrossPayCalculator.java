package chapter2;

//Calculate an employee's gross pay
// The first step is we'd get the number of hours worked.
// Then, we get the hourly pay rate.
// Next, we multiply the hours and the pay rate.
// Finally, we would display the result.

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
    //1. Get the number of hours worked
        System.out.println("Please enter the number of hours worked");
        //to receive the input
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //2. Get the hourly pay rate

        System.out.println("Please enter employee hourly pay rate");
        double hourlyRate  = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours worked by pay rate
        double grossPay = hourlyRate*hoursWorked;
        System.out.println("The employee's gross pay is £" + grossPay);
    }
}
