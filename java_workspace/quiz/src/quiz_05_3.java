import java.util.Scanner;

public class quiz_05_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�̸� ���� ���� ���� ������ ���ʴ�� �Է����ּ���.");
		
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.print("���α׷��� �����մϴ�.");
				break;
			}	
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(name + " �л��� ��������� " + ((double)(a+b+c)/3) + "�Դϴ�.\n" );
		}	
	}
}
