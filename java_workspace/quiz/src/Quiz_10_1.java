import java.util.*;

public class Quiz_10_1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("책제목  저자  출판사  가격을 순서대로 입력하세요 ('exit'를 입력하면 프로그램을 종료합니다.)");		
			String bookName = sc.next();
			if(bookName.equals("exit")) break;
			
			String author = sc.next();
			String publisher = sc.next();
			int price = sc.nextInt();
			a.add(bookName +" " + author +" " + publisher +" " +  price);
		}
			for(int i=0; i<a.size(); i++) {
				String books = a.get(i);
				System.out.println(books + "\n");
				
			}
		
	}

}
