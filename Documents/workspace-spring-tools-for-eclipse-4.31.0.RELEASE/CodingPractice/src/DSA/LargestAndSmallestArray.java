package DSA;

public class LargestAndSmallestArray {
	
	public static void main(String[] args) {
	
		int arr[] = {0,3,2,1,7,9,0};
		int max =0;
		int min =0;
		for(int i =0; i<arr.length; i++) {
			
			if(arr[i] >max) {
				
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("maximum value is :"+ max);
		System.out.println("minimum value is :"+ min);
		
		
 	}

}
