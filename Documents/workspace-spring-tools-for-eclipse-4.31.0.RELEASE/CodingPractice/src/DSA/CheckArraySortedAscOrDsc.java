package DSA;

public class CheckArraySortedAscOrDsc {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,8};
		boolean asc =true;
		boolean des = true;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]>arr[i+1]) {
				des =false;
			}else if(arr[i]<arr[i+1]) {
				asc = false;
				break;
			}
			
		}
		
		//if(check) {System.out.println("Arry is Sorted Order");}
	//	else {
			System.out.println("Array is desc");
		}
 	}

