import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요");
		int num = sc.nextInt();
		if (num % 3 ==0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		sc.close();
	}

}
