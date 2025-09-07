package innr;

//Define an inner class within a for loop.
class Outer3 {
private int outer_x = 250;
void test() {
for(int i=0; i<5; i++) {
class Inner3 {
void display() {
System.out.println("display: outer_x = " + outer_x);
}
}
Inner3 inner = new Inner3();
inner.display();
}
}
}
class scopeforloop {
public static void main(String args[]) {
Outer3 outer = new Outer3();
outer.test();
}
}
