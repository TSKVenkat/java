package ListsArray;
import java.util.*;
public class SetMethod {
	

		  public static void main(String[] args) {
		    ArrayList<Integer> num = new ArrayList<Integer>();
		    num.add(15);
		    num.add(9);
		    num.add(20);
		    num.add(35);
		    num.add(1,5);
		  
		    
		    System.out.println("ArrayList num : " + num);

		    //Replacing element present at 1th index with 40
		    num.set(1, 40);
		    System.out.println("ArrayList num after updating : " + num);
		  }
		}

