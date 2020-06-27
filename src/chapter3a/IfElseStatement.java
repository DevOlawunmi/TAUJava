package chapter3a;
/*
All sales people are expected to make to make 10 sales a week
If they do, they get a congratulatory message, if not they are told the no of shortage.
 */
// If a certain situation occurs <do something>
//otherwise <do something else>
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int expectedSales = 10;
        // get number of sales
        System.out.println("Please enter the number of sales for the week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= expectedSales)
            System.out.println("Congratulations!! You get a bonus");
         else {
            int salesShort = expectedSales - sales;
            if (salesShort == 1) {
                System.out.println("Unfortunately you did not meet this week's quota,  " + "you are " + salesShort + " sale short");  }
                else {
                System.out.println("Unfortunately you did not meet this week's quota,  " + "you are " + salesShort + " sales short");
            }
        }
    }
}
