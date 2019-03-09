import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int searchNumber;
		int arraySize;
		int x = 0;
		System.out.println("How many numbers you want to add in array :");
		arraySize = scanner.nextInt();
		int array[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter Number :");
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter the number which you want to find");
		searchNumber = scanner.nextInt();
		scanner.close();
		for(int j=0;j< arraySize;j++)
		{
			if(array[j]==searchNumber)
			{
				System.out.println("Entered number is found :"+array[j]);
				System.exit(0);
			}
			x++;
		}
		if(x != 0)
		{
			System.out.println("Entered number is no found...Thank You!!!");
			System.exit(0);
		}
		
	}
}
