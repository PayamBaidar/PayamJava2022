package package2;

public class ThisKeyWordExamples {
	
	
	// this key word only revoke the default constructor and we can not use it for parameterized constructors 
	
	
	public ThisKeyWordExamples() {
		
		
		int a = 10;
		
		System.out.println(a);
		
	}
	
	
	public ThisKeyWordExamples(int a, int b) {
        
		//this();
		System.out.println(a+b);
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		
		//ThisKeyWordExamples obj = new ThisKeyWordExamples();
		
		ThisKeyWordExamples obj1 = new ThisKeyWordExamples(20,30);
		
		
		
	}

}
