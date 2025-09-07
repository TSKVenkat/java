package Finals;

 final class Hello111 {
Hello111()
{
	System.out.println("Hi");
}
}
 //class Hello2 extends Hello111
// {
	// System.out.println("Final Class cannot be inherited");
// }
public class Hello  {  
	  void run(){System.out.println("running safely with 100kmph");
	  }  
	    
	  public static void main(String args[]){  
	  Hello obj= new Hello();  
	  Hello111 o2= new Hello111();
	  
	  obj.run();  
	  }  
}