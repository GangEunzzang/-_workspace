import java.util.Scanner;

class Studentz {
		
		String name;
		int korea = 0, 
			english =0, 
			math =0;
		
		public Studentz(String name, int korea, int english, int math) {
			this.name = name;
			this.korea = korea;
			this.english = english;
			this.math = math;
		}
		public double getAvg() {
			return (korea + english + math) /3 ;
		}
}


public class Quiz_07_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studentz[] stu = new Studentz[5];
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("�̸�  ���� ���� ���� ������ ���ʴ�� �Է��ϼ��� ");
			String name = sc.next();
			int korea = sc.nextInt();
			int english = sc.nextInt();
			int math = sc.nextInt();
			
			stu[i] = new Studentz(name, korea, english, math);
		}
			System.out.println("=======================================");
			
		for(int i=0; i<stu.length; i++) {
			System.out.println (stu[i].name +"�л�\n" + "���� :" + stu[i].korea +"\n" +"���� :" + stu[i].english+"\n" +"���� :"+ stu[i].math +"\n");;
			
			sc.close();
		}		
}
}
