//���� ��¥�� 2022�� 2�� 11�� �� �� �� �и�������  >> �ߺ����� �ʰ� ���� !   >> ���ϸ�����. Ȯ���ڴ� log�� !
import java.io.*;
import java.util.*;
public class Quiz11_1 {
// �׷� ��ü�� ���� �ð��� �����ϴ� �� �������ϳ� ??	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a ="";
		FileWriter errorLog = null;
		
		try {
			//errorLog = new FileWriter("c:\\log\\20180221171420.log");
			System.out.println(1/0);
			
		}catch(ArithmeticException e) {	
			a = e.getMessage();		
//		}catch(Exception e) {
//			a=e.getMessage();
//			errorLog.write(a);
			
		}
//		System.out.println(a);
		
	}
}
	
	//error log�� ÷�� �� ���� !
	//���� �̐k�� ���ɹ���/
	//���� �̸��� �ް� 
	//���� �̸��� ���� �ð����� ����


