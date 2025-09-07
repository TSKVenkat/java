import java.util.Scanner;

abstract class area{
    abstract void area(double x);
    abstract void area(double x, double y);
}

class circle extends area{
    void area(double radius){
        double area = 2 * 3.14 * radius;
        System.out.println(area);
    };
    @Override
    void area(double x, double y) {
        // Not applicable, but must define since abstract methods exist
    }
}

class rectangle extends area{
    void area(double length, double breadth){
        double area = length*breadth;
        System.out.println(area);
    }
    void area(double x) {
        // Not applicable
    }
}

class triangle extends area{
    void area(double base, double height){
        double area =(0.5)*base*height;
        System.out.println(area);
    }
    void area(double x) {
        // Not applicable
    }
}

public class arearesult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For circle:\n");
        circle a = new circle();
        double radius = sc.nextDouble();
        a.area(radius);
        System.out.println("For Rectangle:\n");
        rectangle b = new rectangle();
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        b.area(length, breadth);
        System.out.println("For Triangle:\n");
        triangle c = new triangle();
        double base  = sc.nextDouble();
        double height = sc.nextDouble();
        c.area(base,height);

        sc.close();
        
    }
    
} 