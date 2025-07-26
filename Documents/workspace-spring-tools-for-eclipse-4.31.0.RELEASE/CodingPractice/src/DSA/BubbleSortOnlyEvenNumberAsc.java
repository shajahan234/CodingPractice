package DSA;

public class BubbleSortOnlyEvenNumberAsc {

	public static void main(String[] args) {
		
		int [] arr = {5, 3, 2, 8, 1, 4};
		
		int n = arr.length;
		
		for(int i=0; i < n-1; i++) {
			
			for(int j =0; j<n -1; j++) {
				
				if(arr[j]%2==0 && arr[j+1]%2==0) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				}
			}
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
 	}
}
