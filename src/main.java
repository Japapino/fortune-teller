import java.util.Scanner;
public class main {
	public static void body(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name");
		String lastName = input.nextLine(); 
		input.close(); 
		
	}

}
