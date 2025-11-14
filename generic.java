class gen<T>{
    T data;

    gen(T data){
        this.data=data;
    }

    public <U> void display(U data2){
        System.out.println("T data: "+data);
        System.out.println("U data2: "+data2);
    }
}

public class generic{
    public static void main(String[] args){
        gen<String> gn = new gen<String>("Hello");
        gn.display("sheesh");
    }
}