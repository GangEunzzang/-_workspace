import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend; // ������
		int divisor; // ������
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = sc.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�: ");
		divisor = sc.nextInt(); // ������ �Է�
		System.out.println(dividend + "��" + divisor + "�� ������ ����" + dividend/divisor + "�Դϴ�.");
		sc.close();
	}

}
