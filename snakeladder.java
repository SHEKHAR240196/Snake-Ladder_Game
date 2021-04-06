
public class CheckForAOption {
public static void main(String[] args) {
	System.out.println("welcome to snake laddr game");
	
	int position=0;
	int minimum=1;
	int maximum=6;
	
	int randomValue=(int) Math.floor(Math.random()*(maximum-minimum+1)+ minimum);
	int randomOption=(int) (Math.random()*10) % 3;
	
	if(randomOption == 0);
	{
		System.out.println("no play that's why player stay in same position which is" +position);
		
	}
	  
	 if (randomOption == 1);
	{
		position += randomValue;
		System.out.println("Ladder that's why player move ahead and new position is" +position);
		
	}
	  if (randomOption == 2);
	{
	  if(position == 0)
			
		{
			position =0;
			
		}
		else
		{
			position -= randomValue;
			
		}
		 System.out.println("snake that's why player move behind and new position is " + position);
		
	}
		
		
	}
}
