import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		
		switch(score/10) {
			case 10: case 9: case 8: case 7:
				System.out.println("합격입니다.");
				break;
			
			default:
				System.out.println("불합격 입니다.");
		}
		
		
		sc.close();
	}

}
