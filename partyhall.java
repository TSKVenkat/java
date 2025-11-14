import java.util.Scanner;

class AgeRestrictionException extends Exception{
    public AgeRestrictionException(String message){
        super(message);
    }
}

class Employee{
    private int empid;
    private int age;

    public Employee(int empid,int age){
        this.empid=empid;
        this.age=age;
    }

    public int getempid(){
        return empid;
    }

    public int getage(){
        return age;
    }

    public boolean isEven(){
        return empid%2==0;
    }

    public boolean isOdd(){
        return !isEven();
    }
    
}

// keep class non-public because file is named partyhall.java
class partyhallallocator{
    public static String partyhall(Employee emp) throws AgeRestrictionException{
        boolean isEven = emp.isEven();
        int age = emp.getage();

        if(isEven && age<30){
            return "Hall 1";
        }
        if(!isEven && age>30){
            return "Hall 2";
        }

        if(age>30){
            // covers even employees older than 30
            throw new AgeRestrictionException("You are not allowed in hall 1 or hall 3");
        }

        if(age<30){
            // covers odd employees younger than 30
            throw new AgeRestrictionException("You are not allowed in hall 2 and hall 3");
        }

        return "Hall 3";
    }

    public static double getaverageage(Employee[] arr, String hall){
        int sum=0,count=0;

        for(Employee e: arr){
            try{
                if(partyhall(e).equals(hall)){
                    sum += e.getage();
                    count++;
                }
            }catch(AgeRestrictionException ignored){}
        }

        return (count >0)? (double)sum/count : 0.0;
    }
}

public class partyhall{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Employee[] arr1= new Employee[num];

        int empid;
        int age;

        for(int i=0;i<arr1.length;i++){
            System.out.printf("Enter employee %d details (empid age):%n", i);
            empid=sc.nextInt();
            age=sc.nextInt();
            arr1[i] = new Employee(empid,age);
        }

        for(Employee e:arr1){
            try{
                String hall = partyhallallocator.partyhall(e);
                System.out.println("Employee ID: "+e.getempid()+" Age: "+e.getage()+" Party Hall: "+hall);
                System.out.println("Welcome to the party!");
            }catch(AgeRestrictionException ex){
                System.out.println("Employee ID: "+e.getempid()+" Age: "+e.getage()+" Exception: "+ex.getMessage());
            }
            System.out.println();
        }

        System.out.println("Finding Averages:\n");

        for(int i=1;i<=3;i++){
            String hall = "Hall "+i;
            double avg = partyhallallocator.getaverageage(arr1,hall);

            if(avg>0){
                System.out.println("Age average for "+hall+" is "+avg);
            }else{
                System.out.println("No Employees Allocated for "+hall);
            }
        }

        sc.close();
    }
}