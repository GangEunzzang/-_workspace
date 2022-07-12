import java.util.Scanner;

public class ch02_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>b)&(a>c)) {
			if(b+c < a) {
				System.out.println("삼각형이 안된다.");
			}else {
				System.out.println("삼각형이 된다.");
			}
		}
		
		if((b>a)&(b>c)) {
			if(a+c < b) {
				System.out.println("삼각형이 안된다.");
			}else {
				System.out.println("삼각형이 된다.");
			}
		}
		
		if((c>a)&(c>b)) {
			if(a+b < c) {
				System.out.println("삼각형이 안된다.");
			}else {
				System.out.println("삼각형이 된다.");
			}
		}
	}
	}

		
		
	
