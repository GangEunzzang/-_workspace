import java.util.Scanner;

public class raidus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("���� ������ : " );
		
		double radius = sc.nextDouble();
		
		double circleArea = radius * radius * PI;
		
		System.out.println("���Ǹ��� = " + circleArea );

	}

}
