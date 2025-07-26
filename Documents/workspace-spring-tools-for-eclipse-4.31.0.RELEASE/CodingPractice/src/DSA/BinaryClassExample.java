package DSA;

public class BinaryClassExample {

    public static void main(String[] args) {
		
    	int arr[] = {5, 10, 15, 20, 25, 30};
    	
    	int start =0, end = arr.length-1;
    	int target = 100;
    	boolean found = false;
    	
    	while(start <= end) {
    		
    		int mid = start +(end - start)/2;
    		
    		if(target == arr[mid]) {
    			System.out.println("target found "+ mid);
    			found = true;
    			break;
    		}else if(target<arr[mid]){
    			end = mid -1;
    		}else if(target > arr[mid]) {
    			start = mid +1;
    		}
    	}
    	
    	if(!found) {
    		System.out.println("target not found");
    	}
	}
}
