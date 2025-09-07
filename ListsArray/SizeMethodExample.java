package ListsArray;
import java.util.*;
class SizeMethodExample {
    public static void main(String[] args)
    {     
        ArrayList<String> colors= new ArrayList<String>();
        colors.add("red");
        colors.add("orange");
        colors.add("blue");
        colors.add("pink");
        
        
        // Printing elements
        System.out.println("colors : " + colors);

        // Printing the size of ArrayList
        System.out.println("Number of elements present in colors : "        
        + colors.size());
               
    }
} 