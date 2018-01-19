import java.util.Scanner;
public class FortuneTeller {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine(); 
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		System.out.println("What month were you born?");
		String birthMonth = input.nextLine(); 
		
		System.out.println("How many siblings do you have?");
		int numSiblings = input.nextInt(); 
		
		
		System.out.println("Here is your info: /n"
				+firstName+" "+lastName+ "/n"+
				age+' '+birthMonth+' '+numSiblings);
		System.out.println("Is this correct?");
		
		input.close(); 
	}//body

}//main
