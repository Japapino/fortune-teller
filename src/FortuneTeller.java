import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("What is your first name?"); String firstName =
		 * input.nextLine();
		 * 
		 * System.out.println("What is your last name?"); String lastName =
		 * input.nextLine();
		 * 
		 * System.out.println("How old are you?"); int age = input.nextInt();
		 * input.nextLine();
		 * 
		 * System.out.println("What month were you born?"); String birthMonth =
		 * input.nextLine();
		 * 
		 * System.out.println("How many siblings do you have?"); int numSiblings =
		 * input.nextInt(); input.nextLine();
		 */

		// For Testing
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
				+ numSiblings + ' ' + color);
		System.out.println("Is this correct?");
		String answer = input.nextLine().toLowerCase();

		if (answer.equals("yes")) {

			// Age & job
			if (age % 2 == 0) {
				System.out.println("You will like your first job.");
			} else {
				System.out.println("You will hate your first job.");
			}

			// Siblings & Vacation home
			System.out.print("Your vacation home will be in: ");
			if (numSiblings < 0) {
				System.out.println("Wet cardboard box next to Giant Eagle, it will be a time share.");
			} else if (numSiblings == 1) {
				System.out.println("Klyuchevskaya Sopka, the highest peak in Siberia. \n In Russia, sweater wear you.");
			} else if (numSiblings == 2) {
				System.out.println("British Columbia, Canada");
			} else {
				System.out.println("The Acidalia Planitia on Mars, it is quite nice this time of year.");
			}

			// color & transportation
			switch (color.toLowerCase()) {
			case "red":
				System.out.println("Panda powered rickshaw");
				break;
			case "orange":
				System.out.println("Fork lift");
				break;
			case "yellow":
				System.out.println("Solar powered scooter");
				break;
			case "green":
				System.out.println("Portal gun");
				break;
			case "blue":
				System.out.println("Rickity rocket");
				break;
			case "indigo":
				System.out.println("Car");
				break;
			case "violet":
				System.out.println("Carridge");
				break;
			default:
				System.out.println("Your own 2 feet");

			}//Color switch

			//Bank Balance
			System.out.print("Your account balance is: ");
			if (birthMonth<3) {
				System.out.println(birthMonth+numSiblings*(2.3));
			}else if (birthMonth<9 && birthMonth>3) {
				System.out.println((birthMonth-1)*(10*birthMonth)+numSiblings*(2.3));
			}else if (birthMonth>9 && birthMonth<12) {
				System.out.println((birthMonth+1)*0.1+numSiblings*1.4);
			}else {
				System.out.println("You have no bank account, but you do have "+birthMonth+" friends.");
			}//Bank balance
			
		} else {
			System.out.println("Then you have bad fortune for life. Good day.");
		} // answer
		input.close();
	}// body

}// main
