import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade is A");
        } 
        else if (marks >= 80 && marks < 90) {
            System.out.println("Grade is B");
        } 
        else if (marks >= 70 && marks < 80) {
            System.out.println("Grade is C");
        } 
        else if (marks >= 60 && marks < 70) {
            System.out.println("Grade is D");
        } 
        else if (marks >= 40 && marks < 60) {
            System.out.println("Grade is E");
        } 
        else {
            System.out.println("Grade is F, you have failed this subject.");
        }
    }
}
