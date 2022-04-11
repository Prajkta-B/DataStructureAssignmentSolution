package payProcessMain;

import java.util.Scanner;

import payProcessTransactions.Transactions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		
		int[] transactionArray = new int[size];
		System.out.println("Enter the Values of Arrays: ");
		for(int i=0;i<size;i++) {
			transactionArray[i] =  sc.nextInt();
		}
		
		System.out.println("Enter the number of Targets to be achieved :");
		Transactions obj = new Transactions();
		int totalTarget = sc.nextInt();
		for(int i=0;i<totalTarget;i++) {
			System.out.println("Enter the value of Target: ");
			int target = sc.nextInt();
			obj.count(transactionArray, size, target);
			
		}
		
		sc.close();
	}

}
