public class DistanceTest
{
	public static void main(String [] args)
	{
		Distance distance1=new Distance();
		distance1.setFeet(2);
		distance1.setInches(10.5);
		distance1.display();

		Distance distance2=new Distance();
		distance2.setFeet(3);
		distance2.setInches(9.5);
		distance2.display();
		
		Distance distance3;
		distance3 = distance1.add(distance2);
		distance3.display();

	}
}