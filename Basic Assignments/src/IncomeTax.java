import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double package1;
		System.out.println("Enter Your CTC  :");
		package1=scanner.nextDouble();
		
		if(package1 <= 18000)
		{
			System.out.println("You not need to pay tax!!!");
		}
		else if (package1 <= 300000) {
			System.out.println("You have to pay 10% tax");
			System.out.println("Your tax payable amount is "+ package1/10);
		}
		else if (package1 <= 500000) {
			System.out.println("You have to pay 20% tax");
			System.out.println("Your tax payable amount is "+ package1/20);
		}
		else if (package1 <= 1000000) {
			System.out.println("You have to pay 30% tax");
			System.out.println("Your tax payable amount is "+ package1/30);
		}
		
	}

}
