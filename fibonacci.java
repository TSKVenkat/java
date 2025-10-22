import java.util.*;

public class fibonacci{
    static void series(int num){
        System.out.print(0);
        System.out.print(1);
        for(int i=1;i<(num-1);i++){
            System.out.print(i+(i-1));
        }
    }
    public static void main(String args[]){
        int num;
        System.out.println("Enter Range:\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        System.out.println("Fibonacci for range "+num+" is as follows:");
        series(num);
    }
}