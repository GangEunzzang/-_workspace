import java.util.Scanner;

public class ch02_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >>");
		
		int won = sc.nextInt();
		
		
		double dal;
		
		dal = won / 1100 ;
		
		System.out.println(won+ "����  $" + dal +"�Դϴ�.");
		
		
	}		

}
