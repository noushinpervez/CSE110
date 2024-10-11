package practice;

import java.util.Scanner;

public class FoodOrderingSystem {
	public static void main(String[] args) {
		// showing the restaurants name and selecting preferred restaurant
		System.out.println("Choose a Restaurant: ");
		System.out.println("1. Cheez\n2. Dominos\n3. Sturbucks\n4. KFC\n5. Burger King");
		System.out.println("Select your preferred restaurant from 1-5: ");
		Scanner input = new Scanner(System.in);
		int restaurant = input.nextInt();
		
		if (restaurant == 1) {
			// menu for 1st restaurant
			System.out.println("You have chosen Cheez!");
			System.out.println("\nChoose a Food from the Menu: ");
			System.out.println("1. Pizza		150Tk");
			System.out.println("2. Pasta		20Tk");
			System.out.println("3. Cold Drinks		10Tk");
			System.out.println("4. Lemonade		100Tk");
			System.out.println("5. Ice Cream		130Tk");
		
			// number of items want to order
			System.out.println("\nHow many items do you want to order(from 1-5):");
			int n = input.nextInt();
			
			System.out.println("Please select '1 for Pizza', '2 for Pasta', '3 for Cold Drinks', '4 for Lemonade', '5 for Ice Cream'");
			int bill = 0;
		
			// loop for the items
			for (int i = 0; i < n; i++) {
				System.out.println("Please enter your desired Item: ");
				int option = input.nextInt();
				
				// quantity of each food item to calculate the bill
				int quantity = 0;
				System.out.println("Enter the quantity: ");
				quantity = input.nextInt();
			
				if(option == 1) {
					bill = bill + (150 * quantity);
				}
				else if(option == 2) {
					bill = bill + (20 * quantity);
				}
				else if(option == 3) {
					bill = bill + (10 * quantity);
				}
				else if(option == 4) {
					bill = bill + (100 * quantity);
				}
				else if(option == 5) {
					bill = bill + (130 * quantity);
				}
				// showing error for the wrong input
				else {
					System.out.println("Please enter valid input\n");
					i--;
				}
			}
			System.out.println("Your total bill is BDT " + bill + "Tk");
		}
		
		else if (restaurant == 2) {
		// menu of 2nd restaurant
		System.out.println("You Have Chosen Dominos!");
		System.out.println("\nChoose a Food from the Menu: ");
		System.out.println("1. Spicy Chicken	150Tk");
		System.out.println("2. Burger		120Tk");
		System.out.println("3. Soft Drinks		110Tk");
		System.out.println("4. Chicken Wings	110Tk");
		System.out.println("5. Meat Ball		130Tk");
		
		// number of items want to order
		System.out.println("\nHow many items do you want to order(from 1-5):");
		int n = input.nextInt();
		
		System.out.println("Please Press: '1 for Spicy Chicken', '2 for Burger, '3 for Soft Drinks', '4 for Chicken Wings', '5 for MeatBall'");
		int bill = 0;
		
		// loop for the items
		for (int i = 0; i < n; i++) {
			System.out.println("Please enter your desired Item: ");
			int option = input.nextInt();
			
			// quantity of each food item to calculate the bill
			int quantity = 0;
			System.out.println("Enter the quantity: ");
			quantity = input.nextInt();
			
			if(option == 1) {
				bill = bill + (150 * quantity);
			}
			else if(option == 2) {
				bill = bill + (120 * quantity);
			}
			else if(option == 3) {
				bill = bill + (110 * quantity);
			}
			else if(option == 4) {
				bill = bill + (110 * quantity);
			}
			else if(option == 5) {
				bill = bill + (130 * quantity);
			}
			else {
				System.out.println("Please enter valid input\n");
				i--;
			}
		}
		System.out.println("Your total bill is BDT " + bill + "Tk");
	}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact information(11-digit phone number): ");
		String number = sc.nextLine();
		
		System.out.println("Delivery details(address): ");
		String address = sc.nextLine();
		
		System.out.println("Your phone number is " + number + " and address is " + address);
		System.out.println("Please enter 1 to confirm your order");
		int x = input.nextInt();
		
		if(x == 1) {
			System.out.println("Thank you!");
		}
		else {
			System.out.println("Your order was not confirmed.");
		}
	}
}