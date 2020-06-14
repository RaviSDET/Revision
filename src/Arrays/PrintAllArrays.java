package Arrays;

import java.util.Arrays;
import java.util.LinkedList;



public class PrintAllArrays {

	public static void main(String[] args) {
		int [] arr= {1,45,67,78,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
