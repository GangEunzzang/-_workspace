import java.util.Scanner;

public class quiz_05_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[3];
		double sum = 0;
		
		while(true) {
			System.out.println("이름 국어 영어 수학 점수를 차례대로 입력해주세요.");
			String name = sc.next();
			
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
			}
			
			for(int i = 0; i<intArray.length; i++) {
				intArray[i] = sc.nextInt();
				
				sum += intArray[i]; 
			}
			
			System.out.println(name + " 학생의 평균점수는 " + sum/3 + "입니다.\n" );
			
		}
	}
}
