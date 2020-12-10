
public class ToCheckNumberIsBelow100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=78,n2=99,n3=105,n4=111;
       ToCheckNumberIsBelow100 ref = new ToCheckNumberIsBelow100();
       int res1 = ref.toCheckNumBelow100 (n1);
       System.out.println(res1+ " is below 100 ");
       int res2 = ref.toCheckNumBelow100 (n2);  
       System.out.println(res2+ " is below 100 ");
       int res3 = ref.toCheckNumBelow100 (n3);
       System.out.println(res3+ " is below 100 ");
       int res4 = ref.toCheckNumBelow100 (n4);
       System.out.println(res4+ " is below 100 ");
	}
        
        int toCheckNumBelow100(int n) {
        	int result =0;
	   if(n<100)
	   {
		   result =n;
	   } else {
		   System.out.println("IGNORE");
	   }
        return result;
        }
        
        }
