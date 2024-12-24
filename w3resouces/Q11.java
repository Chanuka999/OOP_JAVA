import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    String getTitle(){
        return title;
    }

    void setTitle(String title){
        this.title=title;
    }

    String getAuthor(){
        return author;
    }

    void setAuthor(String author){
        this.author=author;
    }
}

class Library{
    private ArrayList<Book> books;

    Library(){
        books = new ArrayList<Book>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void removeBook(Book book){
        books.remove(book);
    }

    ArrayList<Book> getBooks(){
        return books;
    }
}

public class Q11{
    public static void main(String[] args){
        Library library = new Library();

        Book book1 = new Book("young Herors", "H.G.tuner");
         Book book2 = new Book("101", "Ather.C.klark");

         library.addBook(book1);
         library.addBook(book2);

         System.out.println("Books in the library:");

         for(Book book : library.getBooks()){
            System.out.println(book.getTitle() + " by " + book.getAuthor());

         }

         library.removeBook(book2);
     System.out.println("========================================");
         System.out.println("after removeing :" + book2.getTitle());

          System.out.println(" ");
         for(Book book : library.getBooks()){
             System.out.println(book.getTitle() + " by " + book.getAuthor());
         }
    }
}