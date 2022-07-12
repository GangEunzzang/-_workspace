//오늘 날짜가 2022년 2월 11일 시 분 초 밀리세컨드  >> 중복되지 않게 저장 !   >> 파일명으로. 확장자는 log로 !
import java.io.*;
import java.util.*;
public class Quiz11_1 {
// 그럼 객체를 만들어서 시간을 저장하는 걸 만들어야하나 ??	
	
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
	
	//error log로 첨에 다 시작 !
	//파일 이릏을 어케받지/
	//파일 이름을 받고 
	//파일 이름을 현재 시간으로 변경


