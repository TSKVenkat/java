class RBI{
    Double rate = 3.0;
    Double getInterestRate(){
        return rate;
    }

    void displayinfo(){
        System.out.println("RBI: "+getInterestRate());
    }
}

class sbi extends RBI{
    sbi(Double rate){
        this.rate=rate;
    }
    void displayinfo(){
        System.out.println("SBI: "+getInterestRate());
    }
}

class axis extends RBI{
    axis(Double rate){
        this.rate=rate;
    }
    void displayinfo(){
        System.out.println("Axis: "+getInterestRate());
    }
}

public class rbiextend{
    public static void main(String[] args){
        RBI rbi = new RBI();
        rbi.displayinfo();
        sbi sb = new sbi(8.0);
        sb.displayinfo();
        axis ax = new axis(9.0);
        ax.displayinfo();
    }
}