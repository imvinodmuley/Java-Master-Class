package Section_5;

public class DigitSum {

	public static int sumDigits(int number)
	{
		int sum = 0;
		if(number < 10)
		{
			return -1;
		}
		
		while(number !=0)
		{
			sum += number%10;
			number=number/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(1));
	}

}
