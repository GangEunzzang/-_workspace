import java.util.Scanner;

public class ch02_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�");
		int money = sc.nextInt();
		int m50000,m10000,m1000,m100, m50, m10, m1;
		
		m50000 = money/50000;
		System.out.println("�������� " + m50000 +"��");
		
		m10000 = money%50000/10000;
		System.out.println("������ " + m10000 +"��");
		
		m1000 = money%10000/1000;
		System.out.println("õ���� " + m1000 +"��");
		
		m100 = money%1000/100;
		System.out.println("��� " + m100 +"��");
		
		m50 = money%100/50;
		System.out.println("���ʿ� " + m50 +"��");
		
		m10 = money%50/10;
		System.out.println("�ʿ� " + m10 +"��");
		
		m1 = money%10/1;
		System.out.println("�Ͽ� "
				+ "" + m1 +"��");
		
		
		
		
	}		

}
