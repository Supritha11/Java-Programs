
public class BulbTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb wipro = new Bulb();
		System.out.println("Company : " + wipro.company);
		System.out.println("Price : " + wipro.price);
		System.out.println("Type : " + wipro.type);
		System.out.println("Rating : " + wipro.ratingInWatts);
		System.out.println("----------------------------------------------");
		Bulb philips = new Bulb("Philips", 100, "LED", 10);
		System.out.println("Company: " +philips.company);
		System.out.println("Price : " +philips.price);
		System.out.println("Type : " +philips.type);
		System.out.println("Rating : " +philips.ratingInWatts);
		System.out.println("----------------------------------------------");
		Bulb bajaj = new Bulb("Bajaj", 200, "CFL", 20);
		System.out.println("Company: " +bajaj.company);
		System.out.println("Price : " +bajaj.price);
		System.out.println("Type : " +bajaj.type);
		System.out.println("Rating : " +bajaj.ratingInWatts);
		System.out.println("------------------------------------------------");
		Bulb syska = new Bulb(300,20);
		System.out.println("Price : "+syska.price);
		System.out.println("Rating : "+syska.ratingInWatts);
		System.out.println("Company:"+syska.company);
	}

}
