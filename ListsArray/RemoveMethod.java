package ListsArray;
import java.util.*;
public class RemoveMethod {
	

		  public static void main(String[] args) {
		    ArrayList<String> colors = new ArrayList<String>();
		    colors.add("red");
		    colors.add("orange");
		    colors.add("blue");
		    colors.add("pink");
		    colors.add("black");
		    colors.add("green");

		    System.out.println("ArrayList colors : " + colors);
   
		    // removing element pink from the ArrayList
		    colors.remove("pink");
		    System.out.println("ArrayList colors : " + colors);

		    // removing 3rd element from the ArrayList
		    colors.remove(3);
		    System.out.println("ArrayList colors : " + colors);
		  }
		}

