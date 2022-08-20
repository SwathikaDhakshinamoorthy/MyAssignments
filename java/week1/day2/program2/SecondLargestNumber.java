package week1.day2.program2;

import java.util.Arrays;

public class SecondLargestNumber {
public static void main(String[] args) {
	int [] number = {22,67,98,1,34,58,99};
	int length = number.length;
	Arrays.sort(number);
	System.out.println("The Second Largest Number is: "+number[length-2]);
}
}
