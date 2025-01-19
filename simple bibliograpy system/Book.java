public class Book{
  private int bookId;
  private String title;
  private String author;
  private boolean available;
  
  Book(int bookId,String title,String author){
    this.bookId=bookId;
	this.title=title;
	this.author=author;
	
  }
  
  public int getBookId(){
	  return bookId;
  }
  
  public String getTitle(){
	  return title;
  }
  
  public String getAuthor(){
	  return author;
  }
  
  public boolean getAvailable(){
	  return available;
  }
  
  public void borrowBook(){
	  if(getAvailable()){
		  available=false;
		  System.out.println("has been available");
	  }else{
		  System.out.println("has been not available");
	  }
  }
  
  public void returnBook(){
	  available=true;
	  System.out.println("returned");
	  
  }
  
  public void displayInfo(){
	  System.out.println("Book id :" + bookId + "Book title :"+ title + "Book Author : "+ author + "Book Available :" + available);
  }
}