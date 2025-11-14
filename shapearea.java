import java.util.Scanner;

interface areacalc {
    void calculate();
}

abstract class shape implements areacalc {
    protected String shapename;

    shape(String shapename) {
        this.shapename = shapename;
    }
}

class square extends shape {

    int side;

    square(int side) {
        super("Square");
        this.side = side;
    }

    public void calculate() {
        System.out.println("Area of square: " + (side * side));
    }
}

public class shapearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        square ar = new square(side);
        ar.calculate();
    }
}
