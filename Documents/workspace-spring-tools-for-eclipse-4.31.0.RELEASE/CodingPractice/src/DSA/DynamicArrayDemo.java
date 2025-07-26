package DSA;

import java.util.*;

//import java.util.Arrays.*;

class DynamicArray{
	
	static private int defaultCapacity = 16;
	private int arr[];
	private int size;
	private int capacity;
	
	DynamicArray(){
		arr = new int[defaultCapacity];
		size =0;
		capacity = defaultCapacity;	
	}
	
	public void add(int val) {
	 if(size==capacity) {
		 increaseArray();
	 }
	 arr[size++] =val;
	}
	
	private void increaseArray() {
		capacity *=2;
		arr =java.util.Arrays.copyOf(arr, capacity);
	}
	
	public void display() {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public void insertAtPos(int pos, int val) {
		if(size ==capacity)
			increaseArray();
	  for(int i = size-1; i>pos; i--) 
		 arr[i+1] = arr[i];
	  arr[pos] = val;
	  size++;
	  
	}
	
	
	public void delete(int pos) {
			
		for(int i = pos; i<size-1; i++ ) 
			arr[i] = arr[i+1];
		size--;
		
		if(capacity > defaultCapacity && capacity > 3*size)
		shrinkArray();
		
	}
	
	private void shrinkArray() {
		  capacity /=2;
			Arrays.copyOf(arr, capacity);
		
	}
	
	public int sizeOfArray() {
		
		return size;
	}
	
	public int getIndexVal(int pos) {
		
		return arr[pos];
	}
	
   public int getPositon(int val) {
	   
	   for(int i=0; i<size-1; i++) {
		   if(arr[i] == val) {
			  return i;
		   }
	   }
	   return -1;
   }
   
   public void updateTheValue(int pos, int val) {
	   
	   arr[pos] = val;
   }
   
   public int clearArray() {
	   
	   return size =0;
   }
   
   public boolean containsValue(int val) {
	   
	   for(int i=0; i<size; i++) {
		   
		   if(arr[i]==val) {
			   return true;
		   }
	   }
	   
	  return false; 
   }
	
}
public class DynamicArrayDemo {

	public static void main(String[] args) {
		int val,pos;
		DynamicArray list = new DynamicArray();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n1 Insert at End \n");
			System.out.println("2 Display data \n");
			System.out.println("3 Insert at specified position\n");
		    System.out.println("4 Delete at specified position\n");
		    System.out.println("5 Size of the Array\n");
		    System.out.println("6 Get value to use index position start at 0\n");
		    System.out.println("7 Enter the value to Get Positon(positon start at 0) \n");
		    System.out.println("8 Update the Value \n");
		    System.out.println("9 Clear the Array\n");
		    System.out.println("10 contains the value");
		    System.out.println("11 exit\n");
		    System.out.println("------------------\t");
		    System.out.println("Enter your choice here \n");
			int choice = scan.nextInt();		
		  switch(choice) {
		case 1: System.out.println("Enter the New Value ");
		        val =scan.nextInt();
		         list.add(val);
		         break;
		case 2: System.out.println("Display the value");
		        list.display();
		        break;
		        
		case 3:System.out.println("Enter the positons(position start at 0)");
		       pos = scan.nextInt();
		       if(pos<0) {
		    	   System.out.println("invalid positons");
		    	   break;
		       }
		       System.out.println("Enter the New Value ");
		        val =scan.nextInt();
		        list.insertAtPos(pos, val);
		         break;
		         
		case 4: System.out.println("Enter the positons(position start at 0)");
	       pos = scan.nextInt();
	       if(pos<0) {
	    	   System.out.println("invalid positons");
	    	   break;
	       }
	    	   list.delete(pos);
	    	   break;
		case 5: System.out.println("The Size of the Array Is : "+ list.sizeOfArray());	  
		break;
		
		case 6: System.out.println("Enter the Indext poistions");
		        pos = scan.nextInt();
		       System.out.println(list.getIndexVal(pos)); 
		        break;
		case 7: System.out.println("Enter your Value");
		        val = scan.nextInt();
		       System.out.println("Positons Of The value is :"+ list.getPositon(val));
		       break;
		 
		case 8: System.out.println("Enter the Positions");
		       pos = scan.nextInt();
		       System.out.println("Enter the value");
		       val = scan.nextInt();
		       list.updateTheValue(pos, val);
		       break;
		        
		case 9: System.out.println(" Array Cleard Size Of Array : "+ list.clearArray());
		break ;
		
		case 10: System.out.println("Enter the Value");
		         val = scan.nextInt();
		         System.out.println(list.containsValue(val)); 
		         break;
		case 11 : System.exit(0);  
		
		default: System.out.print("invalid options");
		         
		  }
		}
	}

	
}
