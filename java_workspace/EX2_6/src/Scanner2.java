import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : " );
		String name = sc.next();
		
		System.out.print("�й� : ");
		int hakbun = sc.nextInt();
		
		System.out.print("�а� : ");
		String hakgwa = sc.next();
		
		
		System.out.println("\n\n�̸� : " + name);
		System.out.println("�й� :"  + hakbun);
		System.out.println("�а� :" + hakgwa);
		
	
		
	}
	
	
}
