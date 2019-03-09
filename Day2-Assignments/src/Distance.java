public class Distance
{
	private int feet;
	private double inches;

	public void setFeet(int feet)
	{
		this.feet=feet;
	}

	public void setInches(double inches)
	{
		this.inches=inches;
	}

	public void display()
	{
		System.out.print("Distance in feet is :"+feet);
		System.out.println(" and in inches is :"+inches);
	}

	public Distance add(Distance distance2)
	{
		Distance distance4=new Distance();
		distance4.inches = inches + distance2.inches;
		distance4.feet = feet + distance2.feet;
		if(distance4.inches >= 12)
		{
			distance4.feet = distance4.feet + 1;
			distance4.inches = distance4.inches - 12; 
		}
		return distance4;
 
	}
}