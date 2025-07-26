package DSA;

public class FindMissingNumberInArray {

	public static int missingNumber(int arr[], int n) {
		
		int expected = n*(n+1)/2;
		int actual = 0;
		for(int num:arr) {
			actual +=num;
		}
		
		return expected - actual;
		
	}
	public static void main(String[] args) {
		
		
		int result = missingNumber(new int [] {1,2,3}, 4);
		System.out.println(result);
		
	}
}
