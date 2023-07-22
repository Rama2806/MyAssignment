package Week1day2.Assignments;

import java.util.Arrays;

public class SecndSmallNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={23,45,67,32,89,22};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println("The smallest element is: "+arr[0]);
		System.out.println("The second smallest element is: "+arr[1]);
       }
}