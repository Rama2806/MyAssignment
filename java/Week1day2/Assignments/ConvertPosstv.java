package Week1day2.Assignments;

public class ConvertPosstv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number= -40;
		int ans = 0;
		if(number<0){
		ans= ~(number-1);
		}
		System.out.println("The number" + number + " is converted to " + ans);
	}

}
