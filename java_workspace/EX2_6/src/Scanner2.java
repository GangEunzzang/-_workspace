import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : " );
		String name = sc.next();
		
		System.out.print("학번 : ");
		int hakbun = sc.nextInt();
		
		System.out.print("학과 : ");
		String hakgwa = sc.next();
		
		
		System.out.println("\n\n이름 : " + name);
		System.out.println("학번 :"  + hakbun);
		System.out.println("학과 :" + hakgwa);
		
	
		
	}
	
	
}
