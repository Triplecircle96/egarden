import java.util.Scanner;

private class Egarden {
	private Scanner kybd = new Scanner(System.in);
	private HydroSystem outlet1, outlet2;

	public static void main(String args[]) {
		System.out.println("Welcome to eGarden");
		System.out.println("eGarden is an interface to controlling your hydroponics systems");
		System.out.println("Made by Mo Alshihabi and Siva Movva");
		System.out.println();
		System.out.println("Currently only two outputs on Box are supported (Ones with RED LEDs next to them");

		Boolean cont = true;

		while (cont)
			System.out.println("What would you like to do?");
			System.out.println("1. Alter Outlet 1");
			System.out.println("2. Alter Outlet 2");
			System.out.println("3. Exit");
			int choice = kybd.nextInt();
			if (choice == 1) {
				System.out.println("What would you like to change?");
				System.out.println("1. Set System Type");
				System.out.println("2. Change System Parameters");
				System.out.println("2. Return to Previous Menu");
				int decision = kybd.nextInt();
				if (decision == 1) {
					System.out.println("What System would you like to set up?");
					System.out.println("1. NFT System");
					System.out.println("2. Drip System");
					System.out.println("3. Ebb and Flow");
				} else {
					
				}
			} else if (choice == 2) {
				
			} else if (choice == 3) {
				cont = false;
			}
	}
}