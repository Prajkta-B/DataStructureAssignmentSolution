package denominationsMain;

import java.util.Scanner;

import denominationsPaid.DenominationsUsed;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//denominationsMain input
		int sizeofCurrencyDenominations;
		System.out.println("Enter the size of currency Denominations");
		sizeofCurrencyDenominations = sc.nextInt();
		
		//currency input
		int[] currencyDenominations = new int[sizeofCurrencyDenominations];
		System.out.println("Input the Currency Denominations :");
		
		for(int i=0;i<sizeofCurrencyDenominations;i++) {
			currencyDenominations[i] = sc.nextInt();
		}
		
		int amount;
		System.out.println("Enter the amount to pay :");
		amount = sc.nextInt();
		
		DenominationsUsed obj = new DenominationsUsed();
		obj.calculate(currencyDenominations, sizeofCurrencyDenominations, amount);
	
		sc.close();
	}

}
