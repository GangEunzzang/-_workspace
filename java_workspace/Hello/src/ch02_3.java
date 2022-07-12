import java.util.Scanner;

public class ch02_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오");
		int money = sc.nextInt();
		int m50000,m10000,m1000,m100, m50, m10, m1;
		
		m50000 = money/50000;
		System.out.println("오만원권 " + m50000 +"매");
		
		m10000 = money%50000/10000;
		System.out.println("만원권 " + m10000 +"매");
		
		m1000 = money%10000/1000;
		System.out.println("천원권 " + m1000 +"매");
		
		m100 = money%1000/100;
		System.out.println("백원 " + m100 +"개");
		
		m50 = money%100/50;
		System.out.println("오십원 " + m50 +"개");
		
		m10 = money%50/10;
		System.out.println("십원 " + m10 +"개");
		
		m1 = money%10/1;
		System.out.println("일원 "
				+ "" + m1 +"개");
		
		
		
		
	}		

}
