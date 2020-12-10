
public class Bulb {
 String company;
 int price;
 String type;
 int ratingInWatts;
 
  void lighting() {
	  
	  System.out.println("Lighting a dark space");
  }
  
  Bulb(){
	  company ="Wipro";
	  price = 250;
	  type = "LED";
	  ratingInWatts = 20;
  }
  
  Bulb(String incompany,int inprice,String intype,int inratingInWatts){
	  company = incompany;
	  price = inprice;
	  type = intype;
	  ratingInWatts = inratingInWatts; 
  }
  Bulb(int inputprice, int inputratingInWatts){
	  price = inputprice;
	  ratingInWatts = inputratingInWatts;
  }
  
	  
	  
	  
	  
  }
	  
	  
