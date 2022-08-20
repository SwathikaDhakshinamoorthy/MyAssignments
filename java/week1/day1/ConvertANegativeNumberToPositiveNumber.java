package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {
public static void main(String[] args) {
	
//*** Initialize an integer with a negative number like
	
	int number = -50;
	
//***Check if the number is a negative number
	
	if(number<0) {
		
		System.out.println("The number is negative");
		
//***If so, convert the number to a positive number
		
		number = number+60;
		
		}

//***Print the converted positive number
	
	if(number>0) {
		
	System.out.println("The number is Positive" +number);
	}
}

}
