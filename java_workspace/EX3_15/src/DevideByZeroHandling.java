import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = 10;
		int b = 0;

		try {
			System.out.println(a/b);
		}
		catch(Exception e){   // � ������ ������ �ڼ��ϰ� �˰� ������ 
			//  Exception e �ڽ�Ŭ������ ArithmeticException e �̷��� �ڼ��ϰ� ����
							// �𸥴ٸ�  ����Ŭ������ Exception e �� �ᵵ ��� ����ó�� ����
			System.out.println("0���� ���� �� ������"
					+ "0��! �ٽ� �Է��ϼ���."); //  ����ڿ�
//			e.printStackTrace();  // �����޽����� ���ϰ� �����ؼ� �������   >> �����ڿ�
		}
		System.out.println("�� �κ��� ���� �ɱ��?");

//------------------------------------------------		--------------------------------------
		int[] arr = new int[5];
		try {
		for(int i=0; i<arr.length; i++) {
			arr[i+1]=i;
		}
		}catch(Exception e) {
			System.out.println("�迭�� ������ ������ϴ�.");
			System.out.println("�̺κ��� ����Ǵ��� ������ ����");
		
		}
		
	}

}
