package innr;

class OuterClass {
	  int x = 10;

	  private class InnerClass {
	    int y = 5;
	  }
	}

	public class privateinnerclass {
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	  //OuterClass.InnerClass myInner = myOuter.new InnerClass();
	   
	    System.out.println("value of x="+myOuter.x);
	  }
	}



