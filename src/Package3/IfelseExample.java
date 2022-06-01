package Package3;

public class IfelseExample {

	
	// control statement: is used to control the flow of the program to find out the result for something complicated
	
	
	public void checkOddANDEvenNumber(int number){
		
		if(number % 2 ==0) { 
			System.out.println("even numer "+number);
			
		} else {
			System.out.println("Odd number "+ number);
		}
		
	}
	
	
	public void checkPositiveAndNagetive(int number) {
		
		if(number >=0) {
			System.out.println("Positive number "+ number);
			
		}else {
			System.out.println("Negetive number "+ number);
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

	
		IfelseExample obj=new IfelseExample();
		
		obj.checkOddANDEvenNumber(20);
		
		obj.checkOddANDEvenNumber(25);
		
		obj.checkPositiveAndNagetive(-23);
		
		obj.checkPositiveAndNagetive(23);
		
	}

}
