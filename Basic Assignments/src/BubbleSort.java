import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize;
		int temp;
		System.out.println("How many numbers you want to add in array :");
		arraySize = scanner.nextInt();
		int array[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter Number :");
			array[i] = scanner.nextInt();
		}
		
	
		for(int i=0;i<arraySize-1;i++)
		{
			for(int j=i+1;j<arraySize;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted numbers is");
		for(int k=0;k<arraySize;k++)
		{
			System.out.print(array[k]+" ");
		}
		scanner.close();
	}
}
