import java.util.Scanner;

public class test{
    static {
            System.out.println("Whatsapp number pls!!!!");
        }
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("Thanks for yo number!");
        }catch(Exception error){
            System.out.println(error);
        }
    }
}