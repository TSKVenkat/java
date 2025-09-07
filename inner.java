//import java.util.Scanner;

public class inner{
    static int num = 40;
    static class inner2{
        void display(){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        inner2 in = new inner2();
        in.display();
    }
}