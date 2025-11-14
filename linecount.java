import java.io.*;

public class linecount{
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            int linecount=0;
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                linecount++;
            }
            System.out.println("Line count: "+linecount);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}