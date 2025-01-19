public class Member{
 private int memberId;
 private String name;
 
  Member(int memberId,String name){
   this.memberId=memberId;
   this.name=name;
   this.borrowedBook=null;   
  }
  
  public void borrowBook(Book b){
	  if(b.getAvailable()){
		  b.borrowBook();
		  borrowedBook=b;
		  System.out.println(name + "borrow the book ");
	  }else{
		  System.out.println(name + "the book is not available" );
	  }
	  
  }
  public void returnBook() {
        if (borrowedBook != null) {
            borrowedBook.returnBook();
            System.out.println(name + " has returned the book: " + borrowedBook.title);
            borrowedBook = null;
        } else {
            System.out.println(name + " has not borrowed any book.");
        }
    }
	
 public void displayInfo(){
	 System.out.println("Member id : " + memberId + "name" + name);
	 if(borrowedBook != null){
		 System.out.println(" Borrowed Book :" + borrowedBook.title);
	 }else{
		 System.out.println(" no borrowed book");
	 }
 }
}