public class Main{
  public static void main(String[] args){
    Book book1 = new Book(1,"java","chanuka");
	Book book2 = new Book(2,"php","Randitha");
	Book book3 = new Book(3,"react","facebook");
	
	Member member1 = new Member(1,"kamal");
	Member member2 = new Member(2,"sunil");
	
	member1.borrowBook(book1);
	member2.borrowBook(book2);
	member1.borrowBook(book1);
	
	
	System.out.println("Books Details");
	book1.displayInfo();
	book2.displayInfo();
	book3.displayInfo();
	
	System.out.println("Member details");
	member1.displayInfo();
	member2.displayInfo();
  }
}