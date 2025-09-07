package overloading;

public class Overload {
	   public int add(int a, int b) {
	     return a+b;
	   }
	   public int add(int a, int b, int c) {
		   return a+b+c;
	   }
	   public double add(double a, double b)
	   {
		   return a+b;
	   }
	   public static void main(String args[]) {
	      Overload obj = new Overload();
	     int two= obj.add(20, 40);
	     int th= obj.add(40, 50, 60);
	     double d=obj.add(5.0, 6.9);
	     System.out.println("Adding two numbers:"+two);
	     System.out.println("Adding three numbers:"+th);
	     System.out.println("Adding double numbers:"+d);
	   }
	}