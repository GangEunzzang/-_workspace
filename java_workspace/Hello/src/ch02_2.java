import java.util.Scanner;

public class ch02_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)");
		
		int a = sc.nextInt();
		
		// 10����
		// ������ �����ڸ��� ����
		// �������� �����ڸ��� ���´�
		
		if((a / 10) == (a % 10)) {
			System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		
	}		

}
