package my.assignments;

public class IsPrime {
	public static void main(String[] args) {
		
		int num = 5;
		boolean isPrime = true;
		
		for(int i = 2; i<=num; i++)
		{
			if(num%i == 0) {
				
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("its a Prime Number");
		}
		
		else {
			System.out.println("its not a Prime Number");
		}
	}

}
