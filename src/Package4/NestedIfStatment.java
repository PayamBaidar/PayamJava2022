package Package4;

public class NestedIfStatment {
	
	
	// Nested if is used when the first condition become true or false 
	// this symbol is called % Modulo (Mojoul)
	
	
	public void checkOddEvenAndPositive(int number) {
		
		if (number >=0) {
			System.out.println("number is positive " +number);
			
			if(number % 2 ==0) {
				System.out.println("number is Even " +number );
			}else {
				
				System.out.println("number is Odd "+number );
			}
			
			
			
			
		
		} else { 
			System.out.println("number is Negitive " + number );
			
		}
		}
		

	public static void main(String[] args) {

		NestedIfStatment obj= new NestedIfStatment();
		obj.checkOddEvenAndPositive(22);
		obj.checkOddEvenAndPositive(29);
		obj.checkOddEvenAndPositive(-1);
		obj.checkOddEvenAndPositive(33);
		obj.checkOddEvenAndPositive(39);
		obj.checkOddEvenAndPositive(40);
		obj.checkOddEvenAndPositive(100);
		
	}

}
