package lib1;
import java.util.Scanner;
import java.util.ArrayList;

class LibraryItem {
    protected int itemId;
    protected String title;
    protected String author;
    protected int quantity;
    
    // Constructor
    public LibraryItem(int itemId, String title, String author, int quantity) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
    
    // Default constructor
    public LibraryItem() {
        this.itemId = 0;
        this.title = "";
        this.author = "";
        this.quantity = 0;
    }
    
    void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
    }
    
    // Getters
    public int getItemId() { return itemId; }
    public int getQuantity() { return quantity; }
}

class Book extends LibraryItem {
    private String genre;
    private int pageCount;
    
    // Constructor
    public Book(int itemId, String title, String author, int quantity, String genre, int pageCount) {
        super(itemId, title, author, quantity);
        this.genre = genre;
        this.pageCount = pageCount;
    }
    
    // Default constructor
    public Book() {
        super();
        this.genre = "";
        this.pageCount = 0;
    }
    
    @Override
    void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;
    
    // Constructor
    public Magazine(int itemId, String title, String author, int quantity, int issueNumber, String month) {
        super(itemId, title, author, quantity);
        this.issueNumber = issueNumber;
        this.month = month;
    }
    
    // Default constructor
    public Magazine() {
        super();
        this.issueNumber = 0;
        this.month = "";
    }
    
    @Override
    void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month of publication: " + month);
    }
}

class DVD extends LibraryItem {
    private double duration;
    private String rating;
    
    // Constructor
    public DVD(int itemId, String title, String author, int quantity, double duration, String rating) {
        super(itemId, title, author, quantity);
        this.duration = duration;
        this.rating = rating;
    }
    
    // Default constructor
    public DVD() {
        super();
        this.duration = 0.0;
        this.rating = "";
    }
    
    @Override
    void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Rating: " + rating);
    }
}

class LibraryManager {
    private ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();
    
    void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }
    
    void displayAllItems() {
        System.out.println("\n=== ALL LIBRARY ITEMS ===");
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println("\n--- Item " + (i + 1) + " ---");
            items.get(i).displayItemDetails();
        }
    }
    
    void searchItemById(int itemId) {
        System.out.println("\n=== SEARCHING FOR ITEM ID: " + itemId + " ===");
        boolean found = false;
        
        for (LibraryItem item : items) {
            if (item.getItemId() == itemId) {
                item.displayItemDetails();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    
    int calculateTotalItems() {
        int total = 0;
        for (LibraryItem item : items) {
            total += item.getQuantity();
        }
        return total;
    }
}

public class Library {
    public static void main(String[] args) {
        // Create objects of each subclass
        Book book = new Book(1, "Java Programming", "John Smith", 10, "Programming", 450);
        Magazine magazine = new Magazine(2, "Tech Today", "Editor Board", 15, 25, "September");
        DVD dvd = new DVD(3, "Learning Java", "Tech Productions", 8, 3.5, "Excellent");
        
        // Create library manager
        LibraryManager library = new LibraryManager();
        
        // Add items to library
        System.out.println("=== ADDING ITEMS TO LIBRARY ===");
        library.addItem(book);
        library.addItem(magazine);
        library.addItem(dvd);
        
        // Display all items
        library.displayAllItems();
        
        // Search for specific item by ID
        library.searchItemById(2);
        library.searchItemById(5); // Non-existent ID
        
        // Show total count of items
        int totalItems = library.calculateTotalItems();
        System.out.println("\n=== TOTAL ITEMS COUNT ===");
        System.out.println("Total number of items in library: " + totalItems);
    }
}