import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ ���ʴ�� �Է��ϼ���.");
		int kor = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		double hap = kor + english + math;
		
		System.out.println("�������� ��հ��� : "+ hap/3);
		
	
		
	}
	
	
}
