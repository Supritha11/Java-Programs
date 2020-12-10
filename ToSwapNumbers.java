
public class ToSwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToSwapNumbers ref = new ToSwapNumbers();
		int a1 = 5;
		int b1 = 10;
		System.out.println("Before swapping value of a is " + a1);
		System.out.println("Before swapping value of b is " + b1);
		ref.toSwapNumbers(a1, b1);
		int a2 = 55;
		int b2 = 22;
		System.out.println("Before swapping value of a is " + a2);
		System.out.println("Before swapping value of b is " + b2);
		ref.toSwapNumbers(a2, b2);

		System.out.println("End of program");
	}

	void toSwapNumbers(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a is " + a);
		System.out.println("After swapping value of b is " + b);

	}

}
