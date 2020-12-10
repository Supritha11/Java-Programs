
public class ToSwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 5;
		int b1 = 10;
		System.out.println("Before swapping value of a is " + a1);
		System.out.println("Before swapping value of b is " + b1);
		toSwapNumbers(a1, b1);
		int a2 = 55;
		int b2 = 22;
		System.out.println("Before swapping value of a is " + a2);
		System.out.println("Before swapping value of b is " + b2);
		toSwapNumbers(a2, b2);

		System.out.println("End of program");
	}

	static void toSwapNumbers(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a is " + a);
		System.out.println("After swapping value of b is " + b);
	}

}
