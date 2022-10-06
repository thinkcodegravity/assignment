public class oppsCar {

	//public static void main(String[] args)
	//{
	
	boolean acceleration = true;
	boolean brake = false;
		
	public void moving (String moving)
	{
		while ( acceleration == true ) 
			{
				System.out.println("car is moving");
			}
	}
			
	public void stop (String stop)
	{
		while ( brake == true ) 
			{
				System.out.println("car is not moving");
			}
	}
}