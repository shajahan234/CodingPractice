package DSA;

public class StingPalindrome {

	public static boolean palindrome(String val) {
		
		val = val.toLowerCase().replaceAll(" ", "");
		int start =0;
		int end = val.length()-1;
		boolean result = false;
		while(start<end) {
			
			if(val.charAt(start) == val.charAt(end)) {	
				result = true;
				start++;
				end--;
			}
			else {
				result = false;
			    break;	
			}
			
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		
		boolean result = palindrome("A man a pln a canal Panama");
		System.out.println(result);
		
	}
}
