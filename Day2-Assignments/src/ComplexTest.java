public class ComplexTest
{
	public static void main(String [] args)
	{
		Complex complex=new Complex();
		complex.set(10,20);

		Complex complex1=new Complex();
		complex1.set(7,-2);

		complex.display();
		complex1.display();
		
		Complex complex2;
		complex2=complex.sum(complex1);
		
		complex2.display();
	}
}