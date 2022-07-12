import java.util.Scanner;

public class ch02_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)");
		
		int a = sc.nextInt();
		
		// 10으로
		// 나누면 앞의자리가 남고
		// 나머지는 뒤의자리가 남는다
		
		if((a / 10) == (a % 10)) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		
	}		

}
