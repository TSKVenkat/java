package ListsArray;
import java.util.*;
public class IterationExampleUsingLoops {
	public static void main(String[] args) {
	    ArrayList<String> colors = new ArrayList<String>();
	    colors.add("red");
	    colors.add("orange");
	    colors.add("blue");
	    colors.add("pink");

	    // Printing elements using a simple loop
	    for (int i = 0; i < colors.size(); i++) {
	      System.out.print(colors.get(i) + " ");
	    }
	    System.out.println();

	    // Printing elements using for each loop
	    for (String color : colors) 
	        System.out.print(color + " ");
	  }
}
