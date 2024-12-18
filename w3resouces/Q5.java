import java.util.ArrayList;
class Book{

    private String title;
    private String author;
    private String ISBM;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();
   
   Book(String title,String author,String ISBM){
    this.title=title;
    this.author= author;
    this.ISBM= ISBM;
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
   String getISBM(){
    return ISBM;
   }
   void setISBM(String ISBM){
    this.ISBM=ISBM;
   }

   static void add_Book(Book book){
    bookCollection.add(book);
   }

  static void remove_Book(Book book){
    bookCollection.remove(book);
   }

  static ArrayList<Book> get_BookCollection(){
    return bookCollection;
  }
}

public class Q5{
    public static void main(String[] args){
        Book book1 = new Book("java","chanuka","C001");
        Book book2 = new Book("PHP","kamal","C002");

        Book.add_Book(book1);

        Book.add_Book(book2);

        ArrayList<Book> bookCollection = Book.get_BookCollection();

        System.out.println("List of Books:");

        for(Book book : bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBM " + book.getISBM() );
        }
    }
}