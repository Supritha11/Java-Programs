
public class Mobile {
	String brand;
	String color;
	int storageInGb;
	int price;

	void chatting() {
		System.out.println("To chat");
	}

	void playing() {
		System.out.println("To play");
	}

	Mobile() {
		brand = "Samsung";
		color = "White";
		storageInGb = 128;
		price = 19000;
	}

	Mobile(String inbrand,String incolor,int instorageInGb,int inprice){
		brand = inbrand;
		color = incolor;
		storageInGb = instorageInGb;
		price = inprice;
	}
}
