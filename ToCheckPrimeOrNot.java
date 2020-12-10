
public class ToCheckPrimeOrNot {
	public static void main(String args[])
	{
		int num1 = 5;
		toCheckPrimeOrNot(num1);
		int num2 =8;
		toCheckPrimeOrNot(num2);
		int num3= 11;
		toCheckPrimeOrNot(num3);
		
		System.out.println("End of program");
	}
	static void toCheckPrimeOrNot(int num) {
		
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non -prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");

		
	}

}
