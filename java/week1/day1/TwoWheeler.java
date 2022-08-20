package week1.day1;


public class TwoWheeler {
	
//***	Defining values for variables ***
	
	int  noOfWheels = 2;
	short noOfMirros = 2;
	long chassisNumber = 77896789234571234l;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield"; 
	double runningKM = 20000;
	
//***  Main Method ***
	
		public static void main(String[] args) {
	

//*** Creating Object ***		
		
	TwoWheeler features = new TwoWheeler();

//**Printing Values ***		
		
		System.out.println(features.noOfWheels);
		System.out.println(features.noOfMirros);
		System.out.println(features.chassisNumber);
		System.out.println(features.isPunctured);
		System.out.println(features.bikeName);
		System.out.println(features.runningKM);
		
	}

}
	
	
	
	

