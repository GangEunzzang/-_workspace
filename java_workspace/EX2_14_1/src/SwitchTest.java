import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = sc.nextInt();
		
		switch(score/10) {
			case 10: case 9: case 8: case 7:
				System.out.println("�հ��Դϴ�.");
				break;
			
			default:
				System.out.println("���հ� �Դϴ�.");
		}
		
		
		sc.close();
	}

}
