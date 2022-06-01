package pack1;

public class StaticMethodExp {

	public static void display() {
		
		int x=10;
		int y=25;
		
		int w= x*y;
		System.out.println(w);
		
	}
	
	
	public void nonstaticMethod() {
		
		int a= 12;
		int c=44;
		
		System.out.println(a);
		System.out.println(c);
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		display();
		
		StaticMethodExp obj = new StaticMethodExp();
		
		obj.nonstaticMethod();
	}

}
