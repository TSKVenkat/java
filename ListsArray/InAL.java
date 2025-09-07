package ListsArray;
import java.util.ArrayList;
public class InAL {
	public static void main(String args[]){  
		 ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist    
		     list.add(1);//Adding object in arraylist    
		     list.add(2);    
		     list.add(3);    
		     list.add(10);   
		    //list.remove(1);
		     list.remove(2);
		    // list.remove(10);
		   list.remove(Integer.valueOf(10));
		    // list.remove(10);
		  
		     //Printing the arraylist object   
		     System.out.println(list); 
}
}
