import java.util.Scanner;

public class DisplayResult {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * int studentNumber=1; int name=0;
		 */
		int student[][] = new int[3][3];
		String subjects[] = { "Physics", "Chemistry", "Biology" };
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Marks for Student" + (i + 1));
			for (int j = 0; j < 3; j++) {

				System.out.println("Enter Marks for" + subjects[j]);
				student[i][j] = scanner.nextInt();

			}

		}
		double average = 0;
		double totalScore = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				totalScore += student[i][j];

			}
			average = totalScore / 3;

			System.out.print("Total score of student" + (i+1) + "is :" + totalScore + " " + "and Average is :"
					+ average);

			totalScore = 0;
			average = 0;
			System.out.println();

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				totalScore += student[j][i];

			}
			average = totalScore / 3;
			System.out.print("Total score of students in " + subjects[i] + " is :" + totalScore
					+ " " + "and Average is :" + average);

			totalScore = 0;
			average = 0;
			System.out.println();
		}
	}

}
