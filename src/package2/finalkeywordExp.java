package package2;

public class finalkeywordExp {

	
	// once you declear variable, method or class as a final then you can not change the value 
	// Final method can not be override 
	
	
	
	final int a= 10;
	int b =20;
	
	
	final void khan() {
		
		
		int w = 300;
		System.out.println(w);
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {

		
		finalkeywordExp obj= new finalkeywordExp();
		
		obj.b=100;
		System.out.println(obj.b);
		
		//obj.a=200;  this line is giving me an errore because i change 
		
		obj.khan();
		
		
		
	}

}
