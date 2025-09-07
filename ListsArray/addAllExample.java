package ListsArray;
import java.util.*;
public class addAllExample {
	public static void main(String[] args) {
	      
        // Creating an ArrayList and 
        // adding initial elements
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("C++");

        // Creating another ArrayList 
        // with elements to be added
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("C");
        l2.add("python");

        // Adding all elements 
        // from l2 to l1
       // l1.addAll(l2);
        l1.addAll(1,l2);
        
        System.out.println("" + l1);
        l1.clear();
        System.out.println("" + l1);
    }
}
