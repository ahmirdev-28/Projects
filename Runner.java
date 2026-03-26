import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        // instantiate a Calc object
        Calc myCalculator = new Calc();

        // get user input for two numbers
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        while (!scan.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number:");
            scan.next();
        }
        double n1 = scan.nextDouble();

        System.out.println("Please enter the second number: ");
        while (!scan.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number:");
            scan.next();
        }
        double n2 = scan.nextDouble();

        // pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // output from Calc instance
        System.out.println(myCalculator);

        // examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // output from Calc instance methods
        System.out.println("The sum is: " + myCalculator.add());
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}