package payProcessTransactions;

public class Transactions {
	public void count(int[] arr,int size,int targetValue) {
		int sum = 0;
		int i=0;
		while(i<size) {
			sum = sum + arr[i];
			if(sum >= targetValue) {
				System.out.println("Target is acheived after " + (i+1) + " transactions");
				break;
			}
			i++;
		}
		if(i == size && targetValue >sum) {
			System.out.println("Given target is not achieved");
		}
	}

}
