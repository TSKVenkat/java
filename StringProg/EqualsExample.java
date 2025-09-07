package StringProg;

public class EqualsExample {
	public static void main(String args[]){ 
		String s1="hello"; 
		String s2="Hello"; 
		String s3="hi";
		System.out.println(s1.equalsIgnoreCase(s2));   // returns true
		System.out.println(s1.equalsIgnoreCase(s3));   // returns false
		}
}
