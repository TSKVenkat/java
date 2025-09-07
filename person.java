import java.util.Scanner;

public class person{
    static void display(String name, int age){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    public static void main(String[] args){
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        name  = sc.nextLine();
        age=sc.nextInt();

        display(name, age);
    }
}