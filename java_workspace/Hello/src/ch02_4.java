import java.util.Scanner;

public class ch02_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է� >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>b)&(a>c)) {
			if(b+c < a) {
				System.out.println("�ﰢ���� �ȵȴ�.");
			}else {
				System.out.println("�ﰢ���� �ȴ�.");
			}
		}
		
		if((b>a)&(b>c)) {
			if(a+c < b) {
				System.out.println("�ﰢ���� �ȵȴ�.");
			}else {
				System.out.println("�ﰢ���� �ȴ�.");
			}
		}
		
		if((c>a)&(c>b)) {
			if(a+b < c) {
				System.out.println("�ﰢ���� �ȵȴ�.");
			}else {
				System.out.println("�ﰢ���� �ȴ�.");
			}
		}
	}
	}

		
		
	
