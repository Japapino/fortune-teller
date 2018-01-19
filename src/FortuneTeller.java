import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
/*		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How old are you?");
		int age = input.nextInt();
		input.nextLine();

		System.out.println("What month were you born?");
		String birthMonth = input.nextLine();

		System.out.println("How many siblings do you have?");
		int numSiblings = input.nextInt();
		input.nextLine();*/
		
		//For Testing
		String firstName = "Stefan";
		String lastName = "Murakami";
		int numSiblings = 3;
		int age = 28;
		int birthMonth = 7; 
		

		System.out.println("What is your favorite ROYGBIV color? \n If you do not know type \"help\"");
		String color = input.nextLine();
		if (color.equalsIgnoreCase("help")) {
			System.out.println("Red\nOrange \nYellow \nGreen \nBlue \nIndigo \nViolet");
			System.out.println("What is your favorite ROYGBIV color?");
			color = input.nextLine();
		} else {
			System.out.println("That is good color.");
		}

		System.out.println("Here is your info: \n" + firstName + " " + lastName + "\n" + age + ' ' + birthMonth + ' '
				+ numSiblings +' '+ color);
		System.out.println("Is this correct?");
		String answer = input.nextLine().toLowerCase();

		if (answer.equals("yes")) {
			if (age % 2 == 0) {
				System.out.println("You will like your first job.");
			} else {
				System.out.println("You will hate your first job.");
			}
			
			System.out.print("Your vacation home will be in: ");
			if (numSiblings<0) {
				System.out.println("Wet cardboard box next to Giant Eagle, it will be a time share.");
			} else if (numSiblings==1) {
				System.out.println("Klyuchevskaya Sopka, the highest peak in Siberia. \n In Russia, sweater wear you.");
			} else if (numSiblings ==2) {
				System.out.println("British Columbia, Canada");
			}else{
				System.out.println("The Acidalia Planitia on Mars, it is quite nice this time of year.");
			}
		} else {
			System.out.println("Then you have bad fortune for life. Good day.");
		}//answer

		input.close();
	}// body

}// main
