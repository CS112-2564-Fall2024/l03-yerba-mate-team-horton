import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
  	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;
		
		do
    	{
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			if (choice == 3) {
				break;
			}

			System.out.print("Enter name      : ");
			name = keyboard.nextLine();
			name = keyboard.nextLine();
			System.out.print("Enter ounces    : ");
			ounces = keyboard.nextInt();
			System.out.print("Enter price     $ ");
			price = keyboard.nextDouble();
			System.out.print("Enter brew temperature (in Celsius): ");
			brewTemp = keyboard.nextInt();
			
			switch (choice)
			{
			    case 1: // Tea
			        // Create a Tea, put into array
			        inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
			        count++;
			        break;
				case 2: // YerbaMate
					inventory[count] = new YerbaMate(name, ounces, price, brewTemp, 0);
					System.out.println("Your YerbaMate order has been added: " + inventory[count]);
					count++;
					break;
					default:
						System.out.println("Invalid choice");
						break;
			}
		} while (choice != 3);

		// exit, show all data
		for (int i = 0; i < count; i++) {
			System.out.println(inventory[i]);
		}

		double averagePrice = findAveragePrice(inventory);
		if (averagePrice > 0) {
			System.out.println("Average Price: " + averagePrice);
		} else {
			System.out.println("No Average Price");
		}

		YerbaMate mate = findHighestPricedYerbaMate(inventory);
		if (mate != null) {
			System.out.println("Highest Priced YerbaMate " + mate.getName());
		} else {
			System.out.println("No Highest Priced YerbaMate found");
		}

		System.out.println("Thank you for using Caffeinated Beverages");
	}

	public static double findAveragePrice(CaffeinatedBeverage[] inventory) {
		double sum = 0.0;
		int count = 0;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				sum += inventory[i].getPrice();
				count++;
			}
		}

		if (count > 0) {
			return sum / count;
		} else {
			return 0;
		}
	}

	public static YerbaMate findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory) {
		YerbaMate highest = null;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] instanceof YerbaMate) {
				YerbaMate temp = (YerbaMate) inventory[i];
				if (highest == null
					|| temp.getPrice() > highest.getPrice()) {
					highest = temp;
				}
			}
		}

		return highest;
	}
}