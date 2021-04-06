public class RepeatTillPosition {
	
  public static void main(String[] args) {
	
	 System.out.println("welcome to snake ladder game: ");
         int position = 0;
         int TempPosition;
         int minimum = 1;
         int maximum = 6;


    while(position < 100)
{
	int randomValue = (int) Math.floor(Math.random() * (maximum - minimum + 1) + minimum);  

	int randomOption = (int) (Math.random() * 10) % 3;


	if(randomOption == 0 && position == 0)
		position = 0;

	else if(randomOption == 1 && position < 100)
		position += randomValue;

	else if(randomOption ==2)
	{
		position -= randomValue;
		if(position < 0 )
			position = 0;
	}
        System.out.println("position" + position);

}
    
  }
  
}
