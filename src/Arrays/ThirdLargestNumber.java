package Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int [] arr = {13,34,56,54};
		int largest=arr[0];
		int second=arr[0];
		int third =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				third=largest;
				largest=second;
				second=arr[i];
				
			}else if(arr[i]>second){
				third=second;
				second=arr[i];
			}
			
		}
		System.out.println(third);
	}
	
	
	
	
}
