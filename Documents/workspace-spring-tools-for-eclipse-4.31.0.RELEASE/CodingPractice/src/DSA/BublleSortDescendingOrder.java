package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class BublleSortDescendingOrder {

	public static void main(String[] args) {
		
       int arr[] = {4, 2, 9, 1, 5};
    
	    ArrayList<Integer> evenIndex = new ArrayList<>();
	    ArrayList<Integer> evenNumber = new ArrayList<>();
	    
	
	    for(int i=0; i< arr.length; i++) {
	    
	    	if(arr[i] % 2 == 0) {
	    		evenIndex.add(i);
	    		evenNumber.add(arr[i]);
	    	}
	    }
	    
	    for(int i=0; i< evenNumber.size()-1; i++) {
	    	
	    	for(int j=0; j< evenNumber.size()-1 -i;  j++) {
	    		
	    		if(evenNumber.get(j)> evenNumber.get(j+1)) {
	    			
	    			int temp = evenNumber.get(j);
	    			evenNumber.set(j, evenNumber.get(j+1));
	    			evenNumber.set(j+1, temp);
	    		}
	    	}
	    	
	    }
	    
	    for(int i=0; i<evenIndex.size(); i++) {
	    	
	       arr[evenIndex.get(i)] = evenNumber.get(i);
	    }
	    
	    System.out.println(Arrays.toString(arr));
	}
}
