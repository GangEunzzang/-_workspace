import java.util.Scanner;

public class quiz_05_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[3];
		double sum = 0;
		
		while(true) {
			System.out.println("�̸� ���� ���� ���� ������ ���ʴ�� �Է����ּ���.");
			String name = sc.next();
			
			if(name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
			}
			
			for(int i = 0; i<intArray.length; i++) {
				intArray[i] = sc.nextInt();
				
				sum += intArray[i]; 
			}
			
			System.out.println(name + " �л��� ��������� " + sum/3 + "�Դϴ�.\n" );
			
		}
	}
}
