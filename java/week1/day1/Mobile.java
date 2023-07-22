package week1.day1;

public class Mobile 
{

	public static void main(String[] args) {
		Mobile Basic=new Mobile();
		System.out.println("This is my mobile");
		Basic.makeCall();
		Basic.sendmsg();		
	}
	
	 public static void makeCall() {
		 String mobileModel = "Samsung";
		 float mobileweight = 15.20f;
		 System.out.println(mobileModel);
		 System.out.println(mobileweight);
	} 
	 
	 public static void sendmsg() {
		 boolean isFullCharged = true;
		 int mobileCost = 100000;
			System.out.println(isFullCharged);
			System.out.println(mobileCost);
		}
	 
}