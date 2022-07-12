import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료됩니다.");
		
		while(true) {
			String text = sc.nextLine();
			if(text.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}else {
				System.out.println(text +"을 입력했습니다.");
			}
		}
		sc.close();
	}

}
