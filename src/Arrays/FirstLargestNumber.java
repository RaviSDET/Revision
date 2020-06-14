package Arrays;

public class FirstLargestNumber {
public static void main(String[] args) {
	int[] arr= {35,47,73439,78};
	int first=arr[0];
	int second=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>first) {
			second=first;
			first=arr[i];
		}else if(arr[i]>second) {
			second=arr[i];
		}
	}
	System.out.println(first);
	System.out.println(second);
	
}
}
