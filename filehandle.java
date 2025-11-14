import java.io.*;

public class filehandle{
    public static void main(String[] args){
        String longestword = "";

        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            String line;

            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word: words){
                    word = word.replaceAll("[^a-zA-Z]","");
                    if(word.length() > longestword.length()){
                        longestword = word;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Longest Word: " + longestword);
        System.out.println("Longest word's length: " + longestword.length());
    }
}