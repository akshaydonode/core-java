import java.util.Scanner;

public class CheckResult {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int subject1Marks;
		int subject2Marks;
		int subject3Marks;

		System.out.println("Enter first subject mark :");
		subject1Marks = scanner.nextInt();

		System.out.println("Enter second subject mark :");
		subject2Marks = scanner.nextInt();

		System.out.println("Enter third subject mark");
		subject3Marks = scanner.nextInt();

		if (subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60) {
			System.out.println("You are Passed");
		} else if ((subject1Marks > 60 && subject2Marks > 60) || (subject2Marks > 60 && subject3Marks > 60)
				|| (subject1Marks > 60 && subject3Marks > 60)) {
			System.out.println("You are promoted");

		} else {
			System.out.println("You are failed");
		}
		
		scanner.close();

	}

}
