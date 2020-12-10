
public class ToFindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		toFindFactorial(num1);
		int num2 = 6;
		toFindFactorial(num2);
		int num3 = 3;
		toFindFactorial(num3);
	}

	static void toFindFactorial(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++)
			fact *= i;
		System.out.println("Factorial of number is " + fact);
	}
}