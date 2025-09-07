package Multiple;

//This class contains a member interface.
class A1 {
//this is a nested interface
public interface NestedIF {
boolean isNotNegative(int x);
}
}
//B1 implements the nested interface.
class B1 implements A1.NestedIF {
public boolean isNotNegative(int x) {
return x < 0 ? false: true;
}
}
class NestedIFDemo {
public static void main(String args[]) {
//use a nested interface reference
A1.NestedIF nif = new B1();
if(nif.isNotNegative(10))
System.out.println("10 is not negative");
if(nif.isNotNegative(-12))
System.out.println("this won't be displayed");
}
}