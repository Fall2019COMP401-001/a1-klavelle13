package a1;

import java.util.Locale;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double total = 0.0;

		System.out.print("Input the number of shoppers:");
			int numShop = scan.nextInt();
			String [] shoppers = new String[numShop];
			
			for (int x = 0; x < numShop; x++) {
				System.out.print("Input the full name of the shopper followed by the total number of items purchased: ");
				String fName = scan.next();
				char fLet = fName.charAt(0);
				String lName = scan.next();
				int items = scan.nextInt();
				
				for (int y = 1; y<= items; y++) {
					System.out.print("Enter the number of items bought, followed by the name of the item, and the price: ");
					int count = scan.nextInt();
					String i = scan.next();
					double price = scan.nextDouble();
					total = total + count*price;
					String.format(Locale.US,"%.2f",total);
				}
				
				shoppers[x] = (fLet + ". "+ lName + ": "+ total);
				System.out.println();

			}

			scan.close();
			for(int counter = 0; counter <= shoppers.length - 1; counter++) {
				System.out.println(shoppers[counter]);
			}

	}
}
