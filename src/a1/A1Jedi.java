package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double price = 0.0;
		String first, last;
		

		// Your code follows here.
		System.out.print("Enter total number of items available to purchase: ");
		int num = scan.nextInt();
		String items[] = new String[num];
		int itemsC[] = new int[num];
		int customerC[] = new int[num];
		int copy[] = new int[num];
		
		for (int x = 0; x < items.length; x++) {
			System.out.print("Enter item name and price: ");
			items[x] = scan.next();
			price = scan.nextDouble();
		}
		System.out.println();
		System.out.print("Enter total number of shoppers: ");
		int max = scan.nextInt();
		for(int k = 0; k < max; k++) {
		System.out.println();
		System.out.print("Enter shopper name followed by number of items purchased: ");
		first = scan.next();
		last = scan.next();
		int shoppers = scan.nextInt();
		
		/*makes a copy of the array containing the count 
		 of each of the items so that it can be compared 
		 to the new counts and then determine if the array 
		 counting customers needs to be adjusted		
		*/
		
		for (int y = 0; y < max; y++) {
			copy[y] = itemsC[y];
		}
		for(int i = 0; i < shoppers; i++) {
			System.out.print("Enter the number of the item purchased followed by the name: ");
			int count = scan.nextInt();
			String name = scan.next();
				//adds items to the counter array
				for (int j = 0; j < items.length; j++) {
					if (name.contentEquals(items[j])){
						itemsC[j] = itemsC[j]+count;
					}					
				}}
		for (int m = 0; m < items.length; m++) {
			if (copy[m]<itemsC[m])
				customerC[m] = customerC[m] + 1;
		}
				
		}
		for (int g = 0; g<items.length; g++) {
			if (itemsC[g] == 0)
			{
				System.out.println("No customers bought "+ items[g]+" today.");
			}
			else
				System.out.println(customerC[g]+ " customers bought "+ itemsC[g]+ " "+ items[g] + " today.");
		}

	}
}
