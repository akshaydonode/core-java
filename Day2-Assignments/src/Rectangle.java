public class Rectangle
	{
	private double lengthOfRectangle;
	private double widthOfRectangle;
	

	public Rectangle(double length,double width)
		{
		this.lengthOfRectangle = length;
		this.widthOfRectangle = width;
	
		}
				

	public double getAreaOfRectangle(){
	
		return lengthOfRectangle*widthOfRectangle;
		}

	public double getPerimeterOfRectangle(){
	
		return 2*(lengthOfRectangle*widthOfRectangle);
		}
	}
