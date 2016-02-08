import java.util.Scanner;

public class Main
{

  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);

    // get the month
    int month = scanner.nextInt();

    // get the day
    int day = scanner.nextInt();

    // the special day is February 18
	// expressed purely in days, this is 31 days (for January) and 18 days
	// (from February).
    int specialDay = 31 + 18;
    
	// express the provided month and day purely in days.
	// since we know January has 31 days, and we only care about checking for the special day,
	// it doesn't matter that other months have less than 31 days.
    int providedDay = (month - 1) * 31 + day;

	// Now check whether this is the special day.
	// By converting the input given to days alone, this simplifies the conditional statement
	// (there is no need for boolean operators).
	if (providedDay == specialDay) {
	
		System.out.println("Special");
		
	} else if (providedDay < specialDay) {
	
		System.out.println("Before");
	
	} else {
	
		System.out.println("After");

	}


  }

}