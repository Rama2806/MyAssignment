package week1.day1;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths Basic=new Maths();
		System.out.println(Basic.addition(2, 2)); 
		System.out.println(Basic.Subraction(45, 20));
		System.out.println(Basic.Multiply(7, 8));
		System.out.println(Basic.Division(20, 15));
	}

	public int addition(int a,int b) {
		return (a+b);
	}
	private int Subraction(int a,int b) {
		return (a-b);
	}
	private int Multiply(int a,int b) {
		return (a*b);
	}
	private float Division(float a,float b) {
		return (a/b);
	}
	
}

