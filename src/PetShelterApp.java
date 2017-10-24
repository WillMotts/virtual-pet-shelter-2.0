import java.util.Scanner;

public class PetShelterApp {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		VirtualPet Timmy = new VirtualPet("Timmy", "Dog");
		VirtualPet Jimmy = new VirtualPet("Jimmy", "Cat");
		VirtualPet Bimmy = new VirtualPet("Bimmy", "Fish");

		myShelter.add(Timmy);
		myShelter.add(Jimmy);
		myShelter.add(Bimmy);
		String choice;
		menuMethod();
		optionsMethod();

		do {
			choice = input.nextLine();

			if (choice.equals("1")) {

				System.out.println(myShelter.getPetLists());
				myShelter.doTick();
				System.out.println("Would you like to play with a pet? Y/N");
				String ynAnswer = input.nextLine();
				if (ynAnswer.equals("y")) {
					System.out.println("Who would you like to play with?");
					System.out.println(myShelter.getPetLists());
					String ans = input.nextLine();
					System.out.println("You play with " + ans + "!");
					myShelter.playPet();

				}
			}

			if (choice.equals("2")) {
				myShelter.addWater();
				System.out.println("You gave water to all pets!");
				myShelter.doTick();

			}
			if (choice.equals("3")) {
				myShelter.feedPet();
				System.out.println("You gave food to all pets!");
				myShelter.doTick();

			}
			if (choice.equals("4")) {
				myShelter.doTick();
				myShelter.getHunger();

			}
			if (choice.equals("5")) {
				System.out.println("Enter new pet name!");
				String petnameInput = input.nextLine();
				System.out.println("Enter pet type!");
				String petTypeInput = input.nextLine();

				VirtualPet newPet = new VirtualPet(petnameInput, petTypeInput);
				myShelter.add(newPet);
				
				
			}

		} while (!choice.equals("0"));
		{
			System.out.println("Goodbye!");
		}

	}

	public static void menuMethod() {
		System.out.println("Welcome to the animal shelter!");
		System.out.println("What would you like to do?");
	}

	public static void optionsMethod() {
		System.out.println("1: View all pets");
		System.out.println("2: Water all pets");
		System.out.println("3: Feed all pets");
		System.out.println("4: View pet stats");
		System.out.println("5: Pet intake");
		System.out.println("0: Exit");
	}
}
