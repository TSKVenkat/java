package lib1;
import java.util.Scanner;

public class LibraryItem{
    int itemid =1;
        String title = "book";
        String author = "venkat";
        int quantity = 5;
        void DisplayItemDetails(){
            System.out.println("Item ID: "+itemid);
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Quantity: "+quantity);
        }
    public static void main(String[] args){
        LibraryItem lib = new LibraryItem();
        lib.DisplayItemDetails();
    }
}