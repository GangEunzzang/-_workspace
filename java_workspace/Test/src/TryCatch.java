
public class TryCatch {

	public static void main(String[] args) {
		
		int a = 1;
		
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("정수를 0으로 나눌수 없습니다.");
		}
		
	}

}
