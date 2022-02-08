package Section_4;

public class MinutesToYearAndDaysCalculator {

	public static void printYearsAndDays(long minutes)
	{
		if(minutes<=0)
		{
			System.out.println("Invalid Value");
		}
		else
		{			
			int temp_hour=(int) (minutes/60);
			int remaining_minutes=(int) (minutes%60);
			
			int temp_days=temp_hour/24;
			int remaining_hours=temp_hour%24;
			
			int temp_year=temp_days/365;
			int remaining_days=(int)temp_days%365;
			
			
			System.out.println(minutes+" min = "+temp_year+" y and "+remaining_days+" d");	
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(525660);
	}

}


/*
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * 
 * The method should not return anything (void) and it needs to calculate the
 * years and days from the minutes parameter.
 * 
 * If the parameter is less than 0, print text "Invalid Value".
 * 
 * Otherwise, if the parameter is valid then it needs to print a message in the
 * format "XX min = YY y and ZZ d".
 * 
 * XX represents the original value minutes. YY represents the calculated years.
 * ZZ represents the calculated days.
 * 
 * 
 * EXAMPLES OF INPUT/OUTPUT:
 * 
 * printYearsAndDays(525600); → should print "525600 min = 1 y and 0 d"
 * 
 * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
 * 
 * printYearsAndDays(561600); → should print "561600 min = 1 y and 25 d"
 * 
 * 
 * TIPS:
 * 
 * Be extra careful about spaces in the printed message.
 * 
 * Use the remainder operator
 * 
 * 1 hour = 60 minutes
 * 
 * 1 day = 24 hours
 * 
 * 1 year = 365 days
 * 
 * NOTES
 * 
 * The printYearsAndDays method needs to be defined as public static like we
 * have been doing so far in the course.
 * 
 * Do not add main method to solution code.
 * 
 * The solution will not be accepted if there are extra spaces
 */