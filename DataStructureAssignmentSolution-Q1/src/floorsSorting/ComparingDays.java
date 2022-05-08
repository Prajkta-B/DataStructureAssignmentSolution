package floorsSorting;

import java.util.Comparator;

public class ComparingDays implements Comparator<Integer>{

	@Override
	public int compare(Integer left, Integer right) {
		if(left==right) {
			return 0;
		}
		else if(left<right) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
