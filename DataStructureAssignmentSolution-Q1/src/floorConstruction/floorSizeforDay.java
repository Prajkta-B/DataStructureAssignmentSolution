package floorConstruction;

import java.util.PriorityQueue;

import floorsSorting.ComparingDays;

public class floorSizeforDay {
	static PriorityQueue<Integer> floor_sizes =  new PriorityQueue<Integer>(new ComparingDays());
	
	public static void analyseFloorSizes(int removedFloor,int max,int maxAfterDay,int day) {
		floor_sizes.offer(removedFloor);
		
		System.out.println("Day: " + day);
		if(removedFloor == max) {
			while(floor_sizes.peek() != null && floor_sizes.peek()> maxAfterDay) {
				System.out.println(floor_sizes.poll());
			}
		}
		System.out.println();
	}
}
