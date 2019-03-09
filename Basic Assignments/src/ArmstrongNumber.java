import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number to check it is Armstrong or not :");
		int number = scanner.nextInt();

		int remainder, result = 0, temp = number;

		while (number > 0) {
			remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		
		//Arrays.sort(a);
		System.out.println(result);
		if (temp == result) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
		
		scanner.close();

	}

}
