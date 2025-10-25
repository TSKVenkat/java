import java.util.Scanner;

class partyprogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number of employees:");
        int n = sc.nextInt();
        
        int h1cnt = 0, h2cnt = 0, h3cnt = 0;
        int h1sum = 0, h2sum = 0, h3sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nenter details for employee " + (i + 1));
            System.out.println("enter employee id:");
            int empid = sc.nextInt();
            System.out.println("enter age:");
            int ag = sc.nextInt();
            
            try {
                // check hall 1 condition
                if (empid % 2 == 0 && ag < 30) {
                    throw new hall1exception("you are not allowed in hall 2 or hall 3");
                }
                // check hall 2 condition
                else if (empid % 2 != 0 && ag > 30) {
                    throw new hall2exception("you are not allowed in hall 1 or hall 3");
                }
                // hall 3 condition
                else {
                    System.out.println("welcome to the party - hall 3");
                    h3cnt++;
                    h3sum += ag;
                }
            } catch (hall1exception e) {
                System.out.println(e.getMessage());
                System.out.println("welcome to the party - hall 1");
                h1cnt++;
                h1sum += ag;
            } catch (hall2exception e) {
                System.out.println(e.getMessage());
                System.out.println("welcome to the party - hall 2");
                h2cnt++;
                h2sum += ag;
            }
        }
        
        // calculate average age for each hall
        System.out.println("\naverage age calculation:");
        
        try {
            double h1avg = (double) h1sum / h1cnt;
            System.out.println("hall 1 average age: " + h1avg);
        } catch (ArithmeticException e) {
            System.out.println("exception in hall 1: " + e);
        }
        
        try {
            double h2avg = (double) h2sum / h2cnt;
            System.out.println("hall 2 average age: " + h2avg);
        } catch (ArithmeticException e) {
            System.out.println("exception in hall 2: " + e);
        }
        
        try {
            double h3avg = (double) h3sum / h3cnt;
            System.out.println("hall 3 average age: " + h3avg);
        } catch (ArithmeticException e) {
            System.out.println("exception in hall 3: " + e);
        }
        
        sc.close();
    }
}