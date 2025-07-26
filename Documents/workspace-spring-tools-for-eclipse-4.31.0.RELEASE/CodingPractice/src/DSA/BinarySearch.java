package DSA;

public class BinarySearch {

	public static void main(String[] args) {

	int arr [] = {10, 20, 30, 40, 50};
	
	
	
	
	int start = 0, end = arr.length-1;
	
	int target  = 50;
	
	while(start <= end) {
		
		int mid = start +(end - start)/2;
		
		if(arr[mid] == target) {
			System.out.println("target found at "+ mid );
			break;
		}else if(target > arr[mid]) {
			start = mid+1;
		}else if(target < arr[mid]) {
			end = mid-1;
		}
	}
		
	}	
}
