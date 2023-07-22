package Week1day2.Assignments;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		boolean flag=false;
		for (int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("The given number is a prime number " +num);
			
		}
		else {
			System.out.println("The given number is not a prime number" +num);
		}
	}

	}


