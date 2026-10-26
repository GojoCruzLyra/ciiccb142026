class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    
    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
@Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

    public class Task11{
        public static void main(String[] args){

        Book book1 =  new Book("Java Programming", "John Smith", 2021, 3.99);
        Book book2 =  new Book("Phyton Basics", "Jane Doe", 2020, 29.99);
        Book book3 =  new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book1: ");
        System.out.println(book1);
        System.out.println();

        System.out.println("Book2: ");
        System.out.println(book2);
        System.out.println();

        System.out.println("Book3: ");
        System.out.println(book3);
        System.out.println();
        }
    }
