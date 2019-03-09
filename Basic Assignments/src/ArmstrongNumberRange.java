
public class ArmstrongNumberRange {

	public static void main(String[] args) {
		int number1 = 100;
		int remainder;
		int result = 0;

		while (number1 < 999) {

			int temp = number1;

			while (temp > 0) {
				remainder = temp % 10;
				result = result + remainder * remainder * remainder;
				temp = temp / 10;
			}

			if (result == number1) {
				System.out.println(result + " Number is Armstrong");
			}
			number1++;
			result = 0;
		}

	}

}
