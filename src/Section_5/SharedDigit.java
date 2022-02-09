package Section_5;

public class SharedDigit {

	public static boolean hasSharedDigit(int x,int y)
	{
		if(x < 10 || x>=99 || y<0 || y>99)
		{
			return false;
		}
		int duplicate_y=y;
		while(x != 0)
		{
			int temp_x=x % 10;
			y=duplicate_y;
			while(y != 0)
			{
				int temp_y= y%10;
				if(temp_y==temp_x)
				{
					return true;
				}
				else
				{
					y=y/10;
				}
			}
			x=x/10;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(15, 55));
	}

}

/*
 * Write a method named hasSharedDigit with two parameters of type int.
 * 
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If
 * one of the numbers is not within the range, the method should return false.
 * 
 * The method should return true if there is a digit that appears in both
 * numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 * 
 * 
 * EXAMPLE INPUT/OUTPUT:
 * 
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in
 * both numbers
 * 
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range
 * of 10-99
 * 
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in
 * both numbers
 * 
 * 
 * NOTE: The method hasSharedDigit should be defined as public static like we
 * have been doing so far in the course.
 * 
 * NOTE: Do not add a main method to the solution code.
 */