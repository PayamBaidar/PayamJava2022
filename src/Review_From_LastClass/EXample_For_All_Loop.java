package Review_From_LastClass;

public class EXample_For_All_Loop {

	public static void main(String[] args) {

		
		// simple for loop
		for(int a =0; a<=10; a++) {
			System.out.println(a);
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		
		int arr[]= {23,67,89,9};
		 //Advance Loop
		for (int p:arr) {
			System.out.println(p);
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		
		
		//Labled for Loop
		w:for (int c = 20; c<=30; c++) {
			System.out.println(c);
			
			
			if(c==25)
			{
				break w;
				
			}
			
		}
	}

}
