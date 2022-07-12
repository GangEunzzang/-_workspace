import java.util.*;

class Book{
	private String bookName;
	private String author;
	private String publisher;
	private int price;
	
	public Book(String bookName, String author, String publisher, int price) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public String getbookName() {
		return bookName;
	}
	public String getauthor() {
		return author;
	}
	public String getpublisher() {
		return publisher;
	}
	public int getprice() {
		return price;
	}
}

public class Quiz10_3 {

	public static void main(String[] args) {
		ArrayList<Book> data = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		String bookName;
		String author;
		String publisher;
		int price;
		
		while(true) {
			System.out.println("책제목  저자  출판사  가격을 순서대로 입력하세요 ('exit'를 입력하면 프로그램을 종료합니다.)");		
			bookName = sc.next();
			if(bookName.equals("exit")) break;
			author = sc.next();
			publisher = sc.next();
			price = sc.nextInt();
			Book book = new Book(bookName, author, publisher, price);
			data.add(book);	
		}
		
		
		for(int i = 0; i<data.size(); i++) {
			Book books = data.get(i);
			System.out.println(books.getbookName() +" "+ books.getauthor() +" "+ books.getpublisher() +" "+ books.getprice());
		}
		sc.close();	
	}
	

}
