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
		System.out.println("�̸�  ���� ���� ���� ������ ���ʴ�� �Է��ϼ���");	
		lge.name = sc.next();
		if(lge.name.equals("exit")) {
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
			}
		try {
		lge.korea = sc.nextInt();
		lge.english = sc.nextInt();
		lge.math = sc.nextInt();
		}catch(Exception e){
			System.out.println("ERROR!! ������ �Է����ּ���\n");
			continue;
		}
		System.out.println(lge.name + "�л�\n���� :" + lge.korea +"\n"+ "���� :" + 
				lge.english +"\n"+ "���� :" + lge.math +"\n��� ���� :"+lge.getAvg() +"\n");
		}
		

	}

}

