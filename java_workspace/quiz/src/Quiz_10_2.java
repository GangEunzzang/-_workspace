import java.util.*;
public class Quiz_10_2 {
	public static void main(String[] args) {
		var books = new HashMap<String, String>();
		
		books.put("bookName", "�����ϱ�");
		books.put("author", "�̼���");
		books.put("publisher", "�Ѻ��̵��");
		books.put("price", "15000");
		
		Set<String> book = books.keySet();
		Iterator<String> a = book.iterator();
		
		while(a.hasNext()) {
			String booksKey = a.next();
			String booksValue = books.get(booksKey);
			System.out.println(booksKey + " " + booksValue);
		}
		
	}
	
	
}
