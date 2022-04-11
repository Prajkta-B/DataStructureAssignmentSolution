package denominationSorting;

public class quickSort {

	public void Sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int pi = partition(arr,start,end);
			Sort(arr, start, pi-1);
			Sort(arr, pi +1 , end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[end];
		int p_index = start;
		for(int j=start;j<=end-1;j++) {
			if(arr[j]>=pivot) {
				int temp = arr[p_index];
				arr[p_index] = arr[j];
				arr[j] = temp;
				p_index++;
			}
		}
		int temp = arr[p_index];
		arr[p_index]=arr[end];
		arr[end]=temp;
		return p_index;
	}
	

}
