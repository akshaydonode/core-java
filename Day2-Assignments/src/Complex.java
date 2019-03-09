public class Complex
{
	private double real;
	private double imaginary;

	public void set(double real,double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	public void display()
	{
		System.out.print(real+" ");
		if(imaginary >= 0)
		{
			System.out.println("+ "+imaginary+"i");
		}else{
			System.out.println("- "+Math.abs(imaginary)+"i");
		}
	}
	public Complex sum(Complex complex1)
	{
		Complex complex3 = new Complex();
		complex3.real = real + complex1.real;
		complex3.imaginary = imaginary + complex1.imaginary;
		return complex3;
	}
}