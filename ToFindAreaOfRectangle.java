
public class ToFindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length1 = 3;
		double width1 = 6.50;
		toFindAreaOfRectangle(length1, width1);
		double length2 = 5;
		double width2 = 10.0;
		toFindAreaOfRectangle(length2, width2);
	}

	static void toFindAreaOfRectangle(double length, double width) {
		double area;
		area = length * width;
		System.out.println("Area of rectangle is :" + area);

	}
}
