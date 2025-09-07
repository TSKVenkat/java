package StringProg;

public class EndsWithExample {
	public static void main(String args[]) {
		String s1="hello hi you" ;
		System.out.println(s1.endsWith("u"));       // returns true
		System.out.println(s1.endsWith("you"));     // returns true   
		System.out.println(s1.endsWith("how"));  
		// returns false
		}
}
