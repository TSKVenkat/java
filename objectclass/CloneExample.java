package objectclass;

public class CloneExample implements Cloneable{
	String n;
    int a;

    // Constructor to initialize CloneExample object
    public CloneExample(String n, int a) {
        this.n = n;
        this.a = a;
    }
    // Overriding clone() method 
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneExample{name:'" + n + "', age:" + a + '}';
    }


public static void main(String[] args) {
    try {
      
        // Create a Person object
    	CloneExample p1 = new CloneExample("Madhuri", 37);

        // Clone the Person object
    	CloneExample p2 = (CloneExample) p1.clone();

        // Print both objects
        System.out.println("Original: " + p1);
        System.out.println("Cloned: " + p2);
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
}
}
