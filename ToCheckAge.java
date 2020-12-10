
public class ToCheckAge {
	public static void main(String args[]) {

		int age1 = 10;
		toCheckAge(age1);
		int age2 = 18;
		toCheckAge(age2);
		int age3 = 50;
		toCheckAge(age3);

		System.out.println("End of Program");
	}

	static void toCheckAge(int age) {

		if (age >= 18)

			System.out.println("You are eligible to vote");

		else 

			System.out.println("You are under age ");
		
	}

}
