import java.util.Scanner;

public class factorial{
    static int factorial(int num){
        int res =1;
        for(int i=1;i<=num;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.println("Factorial of "+num+"="+res);
    }
}