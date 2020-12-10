
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfNumber ref = new FactorialOfNumber();
		int num1 = 5;
		ref.toFindFactorial(num1);
		int num2 = 6;
		ref.toFindFactorial(num2);
		int num3 = 3;
		ref.toFindFactorial(num3);

	}

	void toFindFactorial(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++)
			fact *= i;
		System.out.println("Factorial od number is " + fact);
	}

}
