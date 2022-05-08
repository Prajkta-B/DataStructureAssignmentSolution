package floorsMain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import floorConstruction.floorSizeforDay;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building:");
		int nFloors = sc.nextInt();
		
		
		//store the size of floors
		Queue<Integer> floorSizeList = new LinkedList<>();
		for(int i=1;i<=nFloors;i++) {
			System.out.println("Enter the floor size given on day " + i);
			floorSizeList.offer(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println("The order of construction is as follows: ");
		for(int day =1;day<=nFloors;day++) {
			int maxSize = Collections.max(floorSizeList);
			int removeFloor = floorSizeList.poll();
			int maxAfterDay = 0;
			if(floorSizeList.peek() !=null) {
				maxAfterDay = Collections.max(floorSizeList);
			}
			
			floorSizeforDay.analyseFloorSizes(removeFloor,maxSize,maxAfterDay,day);
		}
		
	}

}
