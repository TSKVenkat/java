package innr;

class OuterClass7 {
	  int x = 109;

	  class InnerClass7 {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

	public class outertoinner {
	  public static void main(String[] args) {
	    OuterClass7 myOuter = new OuterClass7();
	    OuterClass7.InnerClass7 myInner = myOuter.new InnerClass7();
	    System.out.println(myInner.myInnerMethod());
	  }
	}