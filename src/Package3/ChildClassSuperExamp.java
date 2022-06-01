package Package3;

public class ChildClassSuperExamp extends ParentClassSuperExmp {

	int b=200;
	
	public ChildClassSuperExamp () {
	
		super();
		
		int a= 30;
		int b=20;
		
		int c=a+b;
		System.out.println(c);
		
		System.out.println(super.b);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		ChildClassSuperExamp obj= new ChildClassSuperExamp();
		
	
		System.out.println(obj.b);
		
	
		
	}

}
