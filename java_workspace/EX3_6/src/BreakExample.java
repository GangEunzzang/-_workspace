import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� ����˴ϴ�.");
		
		while(true) {
			String text = sc.nextLine();
			if(text.equals("exit")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}else {
				System.out.println(text +"�� �Է��߽��ϴ�.");
			}
		}
		sc.close();
	}

}
