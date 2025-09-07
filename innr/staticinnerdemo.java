package innr;

class OuterClass5 {
	 static int x = 10;

	  static class InnerClass5 {
	    int y = 6;
	  }
	  
	}

	public class staticinnerdemo {
	  public static void main(String[] args) {
	    OuterClass5.InnerClass5 myInner = new OuterClass5.InnerClass5();
	    OuterClass5 out =new OuterClass5();
	   
	  System.out.println("value of Inner class from outer" +myInner.y);
	  //  (myInner.x);
	    //System.out.println(my);.
	  }
	}