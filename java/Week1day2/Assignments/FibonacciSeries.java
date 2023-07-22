package Week1day2.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
				
		int range=8;
		int firstNum=0;
		int secNum=1;
		int i,sum;
		
		System.out.println(firstNum);
		for(i=1;i<range;i++) {
		if(i<=1) {
			System.out.println(i);
		}else {
			sum =firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
		}
	}
}
		