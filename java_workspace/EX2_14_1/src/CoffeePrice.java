import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� Ŀ�� �帱��� �մ� ^^ ");
		System.out.println("���� : ����������, īǪġ��, ī���, �Ƹ޸�ī��");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price = 3500; 
				break;
			case "�Ƹ޸�ī��":
				price = 2000;
				break;
			default: 
				System.out.println("�޴��� ������!");
			}
		if(price != 0) 
			System.out.print(order + "�� " + price + "���Դϴ�.");
		sc.close();

	}

}
