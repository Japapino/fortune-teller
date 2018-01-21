import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // initialize scanner named "input"

		// first name block
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) { // if input == "quit", ends the program
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}

		// last name block
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}

		// age block
		System.out.println("How old are you?");
		String ageIn = input.nextLine();
		if (ageIn.equalsIgnoreCase("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(ageIn);
		input.nextLine();

		// birth month block
		System.out.println(
				"What month were you born? \n(express as a number value with 1 for January, 2 for February, etc.");
		String birthMonthIn = input.nextLine();
		input.nextLine();
		if (birthMonthIn.equalsIgnoreCase("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(birthMonthIn);

		// siblings block
		System.out.println("How many siblings do you have?");
		String numSiblingsIn = input.nextLine();

		if (numSiblingsIn.equalsIgnoreCase("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
		int numSiblings = Integer.parseInt(numSiblingsIn);
		input.nextLine();

		// color block
		String color = "";
		System.out.println("What is your favorite ROYGBIV color? \n (If you do not know ROYGBIV type \"help\")");
		color = input.nextLine();
		color.toLowerCase();
		do {
			if (color.equals("quit")) {
				System.out.println("No one likes a quitter...");
				System.exit(0);
			} else if (color.equals("help")) {
				System.out.println("Red\nOrange \nYellow \nGreen \nBlue \nIndigo \nViolet");
				System.out.println("What is your favorite ROYGBIV color?\n (If you do not know type \"help\")");
				color = input.nextLine().toLowerCase();
			} else {

			}

		} while (color.equals("help") || color.equals("quit")
				|| !color.equals("red") && !color.equals("orange") && !color.equals("yellow") & !color.equals("green")
						&& !color.equals("blue") && color.equals("indigo") && !color.equals("violet"));
		System.out.println("That is good color.");

		// Verify
		System.out.println("Here is your info: \n" + firstName + " " + lastName + "\nAge: " + age + "\nBirthMonth: "
				+ birthMonth + "\nNumber of Siblings: " + numSiblings + "\nColor choice: " + color + "\nIs this Correct?");
		String answer = input.nextLine().toLowerCase();

		//Claculations
		if (answer.equals("yes")) {
			;
			// Age & job
			String retirement = "n/a";
			if (age % 2 == 0) {
				retirement = " in " + age * 2.5 + " years,";
			} else {
				retirement = "never, becuase in " + age * 2.1 + " years you will have been uploaded into the cloud,";
			}

			// Siblings & Vacation home

			String vacaHome = "n/a";
			if (numSiblings < 0) {
				vacaHome = "Wet cardboard box next to Giant Eagle, it will be a time share.";
			} else if (numSiblings == 1) {
				vacaHome = "Klyuchevskaya Sopka, the highest peak in Siberia. \n (in Russia, sweater wear you)";
			} else if (numSiblings == 2) {
				vacaHome = "British Columbia, Canada";
			} else {
				vacaHome = "The Acidalia Planitia on Mars, it is quite nice this time of year";
			}

			// color & transportation
			String transport;
			switch (color.toLowerCase()) {
			case "red":
				transport = "a panda powered rickshaw";
				break;
			case "orange":
				transport = "a Fork lift";
				break;
			case "yellow":
				transport = "a Solar powered scooter";
				break;
			case "green":
				transport = "a portal gun";
				break;
			case "blue":
				transport = "a rickity rocket";
				break;
			case "indigo":
				transport = "Car";
				break;
			case "violet":
				transport = "Carridge";
				break;
			default:
				transport = "Your own 2 feet";

			}// Color switch

			// Bank Balance

			Double bankBalance = 0.00;
			if (birthMonth < 3) {
				bankBalance = birthMonth + numSiblings * (2.31);
			} else if (birthMonth < 9 && birthMonth > 3) {
				bankBalance = (birthMonth - 1) * (10 * birthMonth) + numSiblings * (2.35);
			} else if (birthMonth > 9 && birthMonth < 12) {
				bankBalance = (birthMonth + 1) * 0.1 + numSiblings * 1.43;
			} else {
				System.out.println("You have no bank account, but you do have " + birthMonth + " friends.");
			} // Bank balance

			// Read Out
			System.out.println("Well, well, well. Lucky you " + firstName + " of house " + lastName + ". "
					+ "You will retire \n" + retirement + " with a bank balance of " + bankBalance
					+ ", a vacation home\n in " + vacaHome + ", and travel \n" + "by " + transport + ".");

		} else {
			System.out.println("Then you have bad fortune for life. Good day.");
		} // answer
		input.close();
	}// body

}// main
