package Package3;

public class IfelseIFexamples {

	public void checkStudendResult(int studentsMark) {
		
		if(studentsMark >=60 & studentsMark<70 ) {
			
			System.out.println("pass with D great " +studentsMark );
		}else if(studentsMark >=70 & studentsMark <80 ) {
			System.out.println("pass with C great" +studentsMark);
			
		}else if (studentsMark >80 & studentsMark <90) {
			System.out.println("pass with B great " +studentsMark);
			
		}else if (studentsMark >90 & studentsMark <100) {
			System.out.println("pass with great A "+ studentsMark);
		}else if (studentsMark ==100) {
		    System.out.println("pass with A+ " +studentsMark);	
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		
		IfelseIFexamples obj= new IfelseIFexamples();
		
		obj.checkStudendResult(69);
		obj.checkStudendResult(89);
		obj.checkStudendResult(99);
		obj.checkStudendResult(100);
		obj.checkStudendResult(75);
		
		
	}

}
