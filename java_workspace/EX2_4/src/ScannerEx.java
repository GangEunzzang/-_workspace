import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner sc  = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("�̸���" + name + ",");
		
		String city = sc.next();
		System.out.println("���ô�" + city + ",");
		
		int age = sc.nextInt();
		System.out.println("���̴�" + age + "��");
	
		double weight = sc.nextDouble();
		System.out.println("ü����" + weight + "kg");
	
		boolean isSingle = sc.nextBoolean();
		System.out.println("���� ���δ�" + isSingle + "�Դϴ�.");
		
		sc.close();
		
	}

}
