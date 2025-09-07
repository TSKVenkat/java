package pack1;
public class sample1 {
	   
    protected int year = 2024;
    protected void printYear()
    {
        System.out.println("Its " + year + " !!");
    }
 
    public static void main(String[] args)
    {
        sample1 sample = new sample1();
        System.out.println(sample.year);
        sample.printYear();
    }
}