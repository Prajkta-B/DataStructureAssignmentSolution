package denominationsPaid;

import denominationSorting.quickSort;

public class DenominationsUsed {

	public void calculate(int[] arr,int size, int amount) {
		
		quickSort obj = new quickSort();
		obj.Sort(arr,0,size-1);
		
		int[] currencyCounter = new int[size];
		boolean flag = true;
		for(int i=0;i<size;i++) {
			currencyCounter[i] = amount/arr[i];
			amount %= arr[i];
		}
		
		if(amount %arr[size-1] != 0) {
			flag = false;
		}
		
		if(flag == true) {
			System.out.println("Your payment approach in order to give minimum no of notes will be :");
			for(int i=0;i<size;i++) {
				if(currencyCounter[i]!=0) {
					System.out.println(arr[i] + ":" + currencyCounter[i]);
				}
			}
		}
		else {
			System.out.println("Exact amount cannot be tendered");
		}
	}
}
