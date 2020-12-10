
public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile samsung = new Mobile();
		System.out.println("Brand: " + samsung.brand);
		System.out.println("Color: " + samsung.color);
		System.out.println("Storage in GB: " + samsung.storageInGb);
		System.out.println("Price : " + samsung.price);
		System.out.println("-----------------------------------");
		Mobile oneplus = new Mobile();
		System.out.println("Brand: " + oneplus.brand);
		System.out.println("Color: " + oneplus.color);
		System.out.println("Storage in GB: " + oneplus.storageInGb);
		System.out.println("Price : " + oneplus.price);
		System.out.println("----------------------------------------");
		Mobile redmi = new Mobile("Redmi", "Black", 256, 15000);
		System.out.println("Brand : " + redmi.brand);
		System.out.println("Color: " + redmi.color);
		System.out.println("Storage in GB: " + redmi.storageInGb);
		System.out.println("Price: " + redmi.price);
		System.out.println("-----------------------------------------");
		Mobile vivo = new Mobile("Vivo", "White", 128, 20000);
		System.out.println("Brand : " + vivo.brand);
		System.out.println("Color: " + vivo.color);
		System.out.println("Storage in GB: " + vivo.storageInGb);
		System.out.println("Price: " + vivo.price);
	}

}
