package objectclass;

public class category {
	String n;  //name

    // Constructor
    public category(String n) {
        this.n = n;
    }

    // Override toString() for a 
    // custom string representation
    @Override
    public String toString() {
        return "Category{name:'" + n + "'}";
    }

    public static void main(String[] args) {
      
    	category p = new category("IOT Class");
    	category q = new category("IOT Combined");
        // Custom string representation
        System.out.println(p.toString());
      
        // Default hash code value
        System.out.println(p.hashCode()); 
        System.out.println(p.getClass());
        System.out.println(p.equals(q));
        
    }
}

