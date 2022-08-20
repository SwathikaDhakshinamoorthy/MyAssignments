package week1.day2;

public class Car {
	
	public void printMyCarBrand() {
		System.out.println("Tata Altroz");
	}

	public String getCarColour() {
		return "Red";
		}
	public String getCarEngineNumber() {
		return "56789LAUT";
	}
		
	public int subTwoNumbers(int a,int b) {
		int c = a-b;
		return c;
	}
		
	public int multiplyTwoNumbers(int a,int b) {
		int c = a*b;
		return c;
	}
	
	public int divideTwoNumbers(int a,int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Car features = new Car();
		features.printMyCarBrand();
		String colour = features.getCarColour(); 
		System.out.println(colour);
		String engineNo = features.getCarEngineNumber();
		System.out.println(engineNo);
		int sub = features.subTwoNumbers(9, 8);
		System.out.println(sub);
		int multiply = features.multiplyTwoNumbers(9, 8);
		System.out.println(multiply);
		int divide = features.divideTwoNumbers(9, 8);
		System.out.println(divide);
		
		
		
	}
}
