import java.util.Scanner;

public class raidus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("원의 반지름 : " );
		
		double radius = sc.nextDouble();
		
		double circleArea = radius * radius * PI;
		
		System.out.println("원의면적 = " + circleArea );

	}

}
