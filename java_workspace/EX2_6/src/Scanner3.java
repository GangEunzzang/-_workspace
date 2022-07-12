import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요.");
		int kor = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		double hap = kor + english + math;
		
		System.out.println("세과목의 평균값은 : "+ hap/3);
		
	
		
	}
	
	
}
