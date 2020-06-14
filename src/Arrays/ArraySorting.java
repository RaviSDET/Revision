package Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = { 35, 4, 73439, 78 ,7,67,0};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
