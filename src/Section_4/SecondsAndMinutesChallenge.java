package Section_4;

public class SecondsAndMinutesChallenge {

	public static String getDurationString(int minutes,int seconds)
	{
		if(minutes >=0 && seconds >=0 && seconds <= 59)
		{	
			int temp_minutes=(int)minutes%60;
			int temp_hour = (int)minutes/60;
						
			return temp_hour+"h "+temp_minutes+"m "+seconds+"s" ;
			
			
		}
		return "Invalid Value";
	}
	public static String getDurationString(int seconds)
	{
		if(seconds > 0 )
		{
			int temp_second= seconds %60;
			int minutes=(int)seconds/60;	
			
			return getDurationString(minutes,temp_second);
			
		}
		else 
		{
			return "Invalid Value";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(3660));
	}

}
