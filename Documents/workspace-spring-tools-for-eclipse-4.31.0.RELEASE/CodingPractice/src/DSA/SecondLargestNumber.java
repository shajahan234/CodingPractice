package DSA;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {10,9,8,7,6,5};
//		
//	    Arrays.sort(arr);
//	    int secondMax = arr[arr.length-2];
//	    System.out.println(secondMax);
		
	   for(int i=0; i<arr.length-1; i++) {
		 
		   for(int j=0; j<arr.length-1-i; j++) {
		   if(arr[j]>arr[j+1]) {
			   int temp = arr[j];
			    arr[j] =arr[j+1];
			    arr[j+1]=temp;
		   }
		   }
	   }
	   
	   System.out.println(arr[arr.length-2]);
	   System.out.print(Arrays.toString(arr));
	   
	 
	   
	 
	}
}
