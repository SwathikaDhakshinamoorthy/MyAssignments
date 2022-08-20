package my.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
      for(int i= arr[0]; i<arr.length; i++ ) {
		
		if (i != arr[0]) {
			 
			System.out.println("The Missing Number is " + arr[0]);
		}
		
		
	}
}
}
