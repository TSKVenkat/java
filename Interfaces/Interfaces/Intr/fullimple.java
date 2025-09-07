package Intr;

public class fullimple extends incomplete implements Call {
//Whenever you have abstract class it should be implemented by another class
	public void printnum(int a) {
		
		int cubed=a*a*a;
		System.out.println("iam cubed implementation:"+cubed);
	}

}
