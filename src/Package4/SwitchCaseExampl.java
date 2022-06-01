package Package4;


// switch case is the same is if else statement but if switch case
// when the program find the condition it break the rest of the program
// and it doesn't execute the rest of the program 
// if it couldn't find the condition then the default message will execute


public class SwitchCaseExampl {
//CTR+A  and CTR+i
	public static void main(String[] args) {

		verifySwitchCaseResult(10);



	}

public static void verifySwitchCaseResult(int number) {
	

	switch(number)
	{

	case 40:

		System.out.println("condition matched iteraion1"+number);
		break;

	case 30:

		System.out.println("condition matched Iteration2 "+number);
		break;
	case 20:

		System.out.println("condition matched Iteration3 "+number);
		break;
	case 10:

		System.out.println("condition matched Iteration4 "+number);
		break;
	default:

		System.out.println("NO condition found true");
		break;


	}
}

}