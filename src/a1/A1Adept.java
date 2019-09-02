package a1;


import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int small = 0;
		int large = 0;
		double ave = 0.0;
		double bTotal = 0.0;

		System.out.print("Input the number of items available in the store: ");
		int p = scan.nextInt();
		Double itemsP[] = new Double[p];
		String itemsN[] = new String[p];

		for (int x = 0; x < itemsP.length; x++) {
			System.out.print("Enter item name and price: ");
			itemsN[x] = scan.next();
			itemsP[x] = scan.nextDouble();
		}
		
		System.out.println();
		System.out.print("Enter the numbers of shoppers: ");
		int s = scan.nextInt();
		String shopN[] = new String[s];
		Double shopT[] = new Double [s];
		
		for (int y = 0; y < shopN.length; y++){
		  	double total = 0.0;
			System.out.print("Enter the name of the shopper and number of items bought: ");
			String first = scan.next();
			String last = scan.next();
			// add shopper name to a String array
			shopN[y] = first + " "+ last;
			int num = scan.nextInt();
			
			
				for (int z = 1; z <= num; z++) {
					System.out.print("Enter the number of item bought followed by the name of the item: ");
					int quan = scan.nextInt();
					String name = scan.next();	
						//find price of the item bought & calculate total
						for (int search = 0; search < itemsN.length; search++){
							if (name.contentEquals(itemsN[search]) ) {
								total = total + (quan*itemsP[search]);}
					} }
				//add total spent to a parallel array to the names array
				shopT[y] = total;
				System.out.println();
		}
		scan.close();
		
		// find smallest value
	for(int x = 1; x < shopT.length; x++) {
		if(shopT[x]< shopT[small]) {
			small = x;
		}
	}
	
	// find largest value
	for(int x = 1; x < shopT.length; x++) {
		if(shopT[x]> shopT[large]) {
			large = x;
		}
	}
	//finds average spent
	for (int x = 0; x < shopT.length; x++) {
		bTotal = bTotal + shopT[x];
	}
	ave = bTotal/shopT.length;
		
		
	System.out.println();
	System.out.println("Biggest: "+ shopN[large]+ " (" + shopT[large]+ ")");
	System.out.println("Smallest: "+ shopN[small]+ " ("+ shopT[small]+ ")");
	System.out.println("Average: "+ String.format("%.2f", ave));

}}