package pack1;

public class Test1 {

	public static void main(String[] args) {
     
		System.out.println(StaticVariablesExp.a);
		System.out.println(StaticVariablesExp.B);
		
		
		StaticMethodExp.display();
		
		StaticMethodExp nonstaticClassObj = new StaticMethodExp();
		
		nonstaticClassObj.nonstaticMethod();
		
	}

}
