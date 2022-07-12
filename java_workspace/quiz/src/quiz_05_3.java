import java.util.Scanner;

public class quiz_05_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름 국어 영어 수학 점수를 차례대로 입력해주세요.");
		
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}	
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(name + " 학생의 평균점수는 " + ((double)(a+b+c)/3) + "입니다.\n" );
		}	
	}
}
