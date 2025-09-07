import java.util.Scanner;

class conditional{
    public static void main(String[] args){
        System.out.println("Enter integer:");
    Scanner sc = new Scanner(System.in);
    double num = sc.nextInt();
    
    if(num>0){
        System.out.println("Entered number is a positive number");
    }
    else if(num<0){
        System.out.println("Entered number is a negative number");
    }
    else{
        System.out.println("Entered number is zero.");
    }
    }
}