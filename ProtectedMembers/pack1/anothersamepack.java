package pack1;


//Class 1
class Sample {
 protected int year = 2030;
 protected void printYear() {
     System.out.println("Its "+year+" !!");
 }
}

//Class 2
public class anothersamepack {

 // Main driver method 
 public static void main(String[] args) {
     Sample sample = new Sample();
     System.out.println(sample.year);
     sample.printYear();
 }
}