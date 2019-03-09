import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {

		double rateOfInterestPerYearForSI;
		double years;
		double amount;
		double rateOfInterest;
		double compundInterest;
		int compundInterest1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Amount :");
		amount = scanner.nextInt();
		System.out.println("Enter rate of interest :");
		rateOfInterest = scanner.nextInt();
		System.out.println("Enter years");
		years = scanner.nextInt();

		rateOfInterestPerYearForSI = amount / rateOfInterest;

		System.out.println(rateOfInterestPerYearForSI);
		System.out.println("Your Simple Rate of Ineterest is " + rateOfInterestPerYearForSI * years);

		compundInterest = amount * (Math.pow((1 + rateOfInterest / 100), years)) - amount;
		
		compundInterest1=(int) compundInterest;

		System.out.println("Your Compound rate of Interest is " + compundInterest1);
		
		scanner.close();
	}

}
