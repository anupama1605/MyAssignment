package week2.day1.Assignment1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
		//return null;
		}
       
	   public static void main(String[] args) {
	   
		   Library bookType= new Library();
		   String book1=bookType.addBook("Men are from Mars Women are from Venus");
		   System.out.println(book1);
		   String book2= bookType.addBook("Wings of Fire");
		   System.out.println(book2);
           //String booktype= bookType.issueBook();
		   bookType.issueBook();
		   //System.out.println(booktype);

		   
		   
	}
	
	
	
	
	
}
