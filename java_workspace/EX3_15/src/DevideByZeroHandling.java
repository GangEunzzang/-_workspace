import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = 10;
		int b = 0;

		try {
			System.out.println(a/b);
		}
		catch(Exception e){   // 어떤 에러가 나는지 자세하게 알고 있으면 
			//  Exception e 자식클래스인 ArithmeticException e 이렇게 자세하게 쓰고
							// 모른다면  슈퍼클래스인 Exception e 만 써도 모든 예외처리 가능
			System.out.println("0으로 나눌 수 없습니"
					+ "0다! 다시 입력하세요."); //  사용자용
//			e.printStackTrace();  // 에러메시지를 상세하게 추적해서 출력해줌   >> 개발자용
		}
		System.out.println("이 부분이 실행 될까요?");

//------------------------------------------------		--------------------------------------
		int[] arr = new int[5];
		try {
		for(int i=0; i<arr.length; i++) {
			arr[i+1]=i;
		}
		}catch(Exception e) {
			System.out.println("배열이 범위를 벗어났습니다.");
			System.out.println("이부분이 실행되는지 보세용 ㅎㅎ");
		
		}
		
	}

}
