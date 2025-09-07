package ListsArray;
import java.util.*;
public class SortMethod {
	
		  public static void main(String[] args) {
		    ArrayList<String> names = new ArrayList<String>();
		    names.add("Bhanu");
		    names.add("Zaara");
		    names.add("Shashank");
		    names.add("Ansh");
		    System.out.println("Before sorting, names : " + names);

		    //Sorting ArrayList in ascending order
		    Collections.sort(names);
		   
		    System.out.println("After sorting, names : " + names);
		  }
		}