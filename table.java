import java.util.Scanner;

public class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mult = sc.nextInt();

        for(int i=1;i<mult+1;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}