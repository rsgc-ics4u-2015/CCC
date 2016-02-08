import java.util.Scanner;

public class SumExample
{

  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);

    // prompt for first number
    System.out.print("Enter an integer: ");

    // get the value as an integer
    int firstInteger = scanner.nextInt();

    // prompt for the second number
    System.out.print("Enter the second number: ");

    // get the age as an int
    int secondInteger = scanner.nextInt();
    
    // calculate the sum
    int sum = firstInteger + secondInteger;

	// report the output
    System.out.println(String.format("The sum of the numbers is %d", sum));

  }

}