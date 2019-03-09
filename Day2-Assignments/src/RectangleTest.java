public class RectangleTest
{
	
	public static void main(String [] args)
	{

		Rectangle rectangle1=new Rectangle(10,8);
				
		System.out.println("Area of Rectangle is: "+rectangle1.getAreaOfRectangle());
		System.out.println("Perimeter of Rectangle is: "+rectangle1.getPerimeterOfRectangle());
		
		Rectangle rectangle2=new Rectangle(11,9);
		
		System.out.println("Area of Rectangle is: "+rectangle2.getAreaOfRectangle());
		System.out.println("Perimeter of Rectangle is: "+rectangle2.getPerimeterOfRectangle());


		if(rectangle1.getAreaOfRectangle() == rectangle2.getAreaOfRectangle()){
			System.out.println("Area of Rectangle is Same");
		}
		else{
			System.out.println("Area of Rectangle is NOT Same");
		}

		
		if(rectangle1.getPerimeterOfRectangle()  ==  rectangle2.getPerimeterOfRectangle()){
			System.out.println("Perimeter of Rectangle is Same");
		}
		else{
			System.out.println("Perimeter of Rectangle is NOT Same");
		}
	}
}