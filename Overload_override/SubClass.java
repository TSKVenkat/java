package overloading;
class SuperClass {
    void sample() {
        System.out.println("Method of the super class");
    }
}
public class SubClass extends SuperClass {
    void sample() {
    //	super.sample();
        System.out.println("Method of the sub class");
    }
    public static void main(String args[]) {
    	SubClass obj1 = new SubClass();
        
        obj1.sample();
        
    }
}