package my.assignments;



public class Calculator {
	
	//

	public int addThreeNumbers(int a,int b,int c) {
		int sum = a+b+c;
		return sum;
	}
	public int subThreeNumbers(int a,int b,int c) {
		int sub = a-b-c;
		return sub;
	}
	public double multiplyTwoNumbers(double a,double b) {
		double multiply = a*b;
		return multiply;
	}
	public float divideTwoNumbers(float a,float b) {
		float divide = a/b;
		return divide;
	}


public static void main(String[] args) {
		
	
	Calculator perform = new Calculator();
	
	int addition = perform.addThreeNumbers(9, 8, 9);
	System.out.println(addition);
	int subtraction = perform.subThreeNumbers(209, 8, 211);
	System.out.println(subtraction);
	double multiplication = perform.multiplyTwoNumbers(9, 8);
	System.out.println(multiplication);
	float division = perform.divideTwoNumbers(522, 8);
	System.out.println(division);
	
	
}

}

