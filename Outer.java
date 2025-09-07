import java.util.Scanner;

public class Outer{
    static{
        System.out.println("lets use static!!!");//runs immediately once class is loaded
    }
    static Scanner sc = new Scanner(System.in);//static object
    static int num = sc.nextInt();
    static class Inner{//static inner class initialization
        void display(){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        Inner inner =  new Inner();//creating object for accessing Inner class
        inner.display();//function call
    }
}