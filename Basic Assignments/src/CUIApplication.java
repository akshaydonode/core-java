import java.util.Scanner;

public class CUIApplication {

	public static void main(String[] args) {
		

		int x = 1;
		String name;
		String password;
		Scanner scanner = new Scanner(System.in);
		
		while (x < 4) {
		System.out.println("Enter name:");
		name = scanner.next();
		System.out.println("Enter password :");
		password = scanner.next();

		
	
			if (name.equals("root") && password.equals("root123")) {
				System.out.println("Welcome!!!" + name);
				System.exit(0);
			}
			else if(x == 3)
			{
				System.out.println("You attempted 3 times...");
				System.out.println("Contact Admin. Thank You!!! ");
				System.exit(0);
			}
			else {
				System.out.println("Enter name and password again.");
				
			}
			x++;
		}
		
		scanner.close();
	}

}
