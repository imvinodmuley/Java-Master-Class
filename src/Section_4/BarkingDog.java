package Section_4;

public class BarkingDog 
{
	public static boolean shouldWakeUp(boolean barking,int hourOfDay)
	{
		if(hourOfDay < 0 || hourOfDay > 23)
		{
			return false;
		}
		if(barking)
		{
			if(hourOfDay<8 || hourOfDay > 22)
			{
				return true;
			}
		}

		return false;
		
	}
	public static void main(String a[])
	{
		System.out.print(shouldWakeUp (true, 1));
	}

}


/*
 * We have a dog that likes to bark. We need to wake up if the dog is barking at
 * night!
 * 
 * Write a method shouldWakeUp that has 2 parameters.
 * 
 * 1st parameter should be of type boolean and be named barking it represents if
 * our dog is currently barking. 2nd parameter represents the hour of the day
 * and is of type int with the name hourOfDay and has a valid range of 0-23.
 * 
 * We have to wake up if the dog is barking before 8 or after 22 hours so in
 * that case return true.
 * 
 * In all other cases return false.
 * 
 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
 * 
 * Examples of input/output:
 * 
 * shouldWakeUp (true, 1); → should return true
 * 
 * shouldWakeUp (false, 2); → should return false since the dog is not barking.
 * 
 * shouldWakeUp (true, 8); → should return false, since it's not before 8.
 * 
 * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter
 * needs to be in a range 0-23.
 * 
 * 
 * TIP: Use the if else statement with multiple conditions.
 * 
 * NOTE: The shouldWakeUp method needs to be defined as public static like we
 * have been doing so far in the course.
 * 
 * NOTE: Do not add a main method to solution code.
 */