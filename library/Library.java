package lib1;
import java.util.*;

class LibraryItem{
    protected int ItemId;
    protected String title;
    protected String author;
    protected int quantity;

    public LibraryItem(int ItemId, String title,String author, int quantity){
        this.ItemId = ItemId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public LibraryItem(){
        this.ItemId = 0;
        this.title="";
        this.author="";
        this.quantity=0;
    }

    void displayItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
    }

    void getItemId(){return ItemId;}
    void getQuantity(){return quantity;}
}

class Book extends LibraryItem{
    private String genre;
    private int pageCount;
    public Book(int ItemId, String title,String author, int quantity, String genre, int pageCount){
        super(ItemId,title,author,quantity);
        this.genre=genre;
        this.pagCount=pageCount;
    }

    public Book(){
        super();
        this.genre="";
        this.pageCount=0;
    }
    void displayItemDetails(){
        super();
        System.out.println("Genre: "+genre);
        System.out.println("pageCount: "+pageCount);
    }
}

class Magazine extends LibraryItem{
    private int issueNumber;
    private String month;
    public Magazine(int ItemId, String title,String author, int quantity,int issueNumber,String month){
        super(ItemId,title,author,quantiy);
        this.issueNumber = issueNumber;
        this.month=month;
    }
    public Magazine(){
        super();
        this.issueNumber=0;
        this.month="";
    }
    void displayItemDetails(){
        super();
        System.out.println("Issue Number: "+issueNumber);
        System.out.println("month: "+month);
    }
}

class DVD extends LibraryItem{
    private double duration;
    private String rating;
    public DVD(int ItemId, String title,String author, int quantity,double duration,String rating){
        super(ItemId,title,author,quantiy);
        this.duration = duration;
        this.rating=rating;
    }
    public DVD(){
        super();
        this.duration=0.00;
        this.rating="";
    }
    void displayItemDetails(){
        super();
        System.out.println("Duration: "+duration);
        System.out.println("Rating: "+rating);
    }
}

class LibraryManager{
    private ArrayList<LibraryItem> arr = new ArrayList<LibraryItem>();
    void additem(LibraryItem item){
        arr.add(item);
        System.out.println("Item added Successfully");
    }
    void displayAllItems(LibraryItem item){
        for(int i=0;i<item.size();i++){
            System.out.println(i);
        }
    }
    void searchItemById(int ItemId){
        found = False;
        for(LibraryItem item: arr){
            if(item.getItemId() == arr.ItemId){
                found=True;
                System.out.println(item);
                System.out.println("Item found!");
                break;
            }
        }
        if(!found){
            System.out.println("Item not found");
        }
    }
    void calculateTotalItems(){
        total=0;
        for(LibraryItem items:arr){
            total += arr.getQuantity();
        }
        System.out.println("Total count of items in the library "+total);
    }
}

public class Library{
    public static void main(String[] args){
        Book book = new Book(1, "Java Programming", "John Smith", 10, "Programming", 450);
        Magazine magazine = new Magazine(2, "Tech Today", "Editor Board", 15, 25, "September");
        DVD dvd = new DVD(3, "Learning Java", "Tech Productions", 8, 3.5, "Excellent");

        LibraryManager lb = new LibraryManager();

        lb.add(book);
        lb.add(magazine);
        lb.add(dvd);

        lb.displayAllItems();
        lb.searchItemById(2);
        lb.searchItemById(30);

        lb.calculateTotalItems();
    }
}