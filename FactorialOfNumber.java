
public class WhileLoopExamples {

	public static void main(String[] args) {
		System.out.println("To find factorial of given number");
		int num = 5, fact = 1, i = 1;
		while (i <= num) {
			fact *= i;
			i++;
		}
		System.out.println("factorial of given number is :" + fact);
	}

}
