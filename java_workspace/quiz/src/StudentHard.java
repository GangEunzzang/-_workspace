import java.util.Scanner;

//public class StudentHard {
//	
//	String name;
//	int korea = 0, 
//		english =0, 
//		math =0;
//	
//	public double getAvg() {
//		return (korea + english + math) /3 ;
//	}


	public class StudentHard {
		
		String name;
		int korea = 0, 
			english =0, 
			math =0;
		
		public double getAvg() {
			return (korea + english + math) /3 ;
		}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentHard lge = new StudentHard();
		
		while(true) {
		System.out.println("이름  국어 영어 수학 점수를 차례대로 입력하세요");	
		lge.name = sc.next();
		if(lge.name.equals("exit")) {
			System.out.println("프로그램이 종료됩니다.");
			break;
			}
		try {
		lge.korea = sc.nextInt();
		lge.english = sc.nextInt();
		lge.math = sc.nextInt();
		}catch(Exception e){
			System.out.println("ERROR!! 정수만 입력해주세요\n");
			continue;
		}
		System.out.println(lge.name + "학생\n국어 :" + lge.korea +"\n"+ "영어 :" + 
				lge.english +"\n"+ "수학 :" + lge.math +"\n평균 점수 :"+lge.getAvg() +"\n");
		}
		

	}

}

