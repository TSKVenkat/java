import java.util.Scanner;

class hiringprogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter candidate name:");
        String nm = sc.nextLine();
        
        System.out.println("enter qualification:");
        String qual = sc.nextLine();
        
        System.out.println("enter age:");
        int ag = sc.nextInt();
        
        try {
            // check eligibility criteria
            if (!qual.equalsIgnoreCase("phd") || ag >= 40) {
                throw new invalidcandidateexception("candidate not eligible for hiring");
            }
            System.out.println("candidate " + nm + " is eligible for hiring");
        } catch (invalidcandidateexception e) {
            System.out.println("exception: " + e.getMessage());
        }
        
        sc.close();
    }
}