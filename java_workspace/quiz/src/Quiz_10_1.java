import java.util.*;

public class Quiz_10_1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("å����  ����  ���ǻ�  ������ ������� �Է��ϼ��� ('exit'�� �Է��ϸ� ���α׷��� �����մϴ�.)");		
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
