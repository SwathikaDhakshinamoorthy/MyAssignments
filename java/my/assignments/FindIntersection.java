package my.assignments;

import java.util.Arrays;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};
		int [] arr2 = {1,2,8,4,9,7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i=0; i<=arr1.length; i++) {
			
			for (int j=0; j<=arr2.length; j++) {
				
				if (i == j) {
					
					System.out.println("Print the first array" +arr1[i]);
				}
			}
		}
		
	}

}
