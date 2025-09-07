import java.util.Scanner;

public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Entered string: "+s);
        System.out.println("Output String: "+ s.toUpperCase());
        System.out.println("Output String: "+ s.toLowerCase());
    }
}