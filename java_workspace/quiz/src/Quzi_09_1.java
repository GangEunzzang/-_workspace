import java.util.Scanner;

public class Quzi_09_1 {
	
	private static int i;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = "010101-123456";
		System.out.println(num.substring(0,6));   // 1��
		System.out.println("-----------------------");
		
		String tel ="010-1234-5678";
		System.out.println(tel.replace("-", "" ));    // 2��
		System.out.println("-----------------------");
		
		String goods ="E20160001";
		System.out.println(goods.charAt(0));       // 3��
		System.out.println("-----------------------");
		
		System.out.println(goods.substring(1,5));    // 4��
		System.out.println("-----------------------");
		
		String csv = "ȫ�浿,010-1111-2222,hkd@hkd.com"; // 5��
		String[] result = csv.split(",");
		for(String a :result) {
			System.out.println(a);
		}System.out.println("-----------------------");
		
		String csv2 = "EL201800001,CH201800021,EN12231";  //6��
		String[] result2 = csv2.split(",");
		for(String a:result2) {
			if(a.equals("EL201800001")) {
				System.out.println(a.substring(2)+"-���ڰ��а�");
			}else if(a.endsWith("CH201800021")) {
				System.out.println(a.substring(2)+"-ȭ�а��а�");
			}else {
				System.out.println(a.substring(2)+"-������а�");
			}
		}System.out.println("-----------------------");
		
		
		
		
		while(true) {
		System.out.print("ID�� �Է��Ͻÿ� >> ");        //7��
		String ID = sc.next();	 
		if(ID.contains("!")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("@")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("#")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("$")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("%")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("^")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else if(ID.contains("&")) {
		System.out.println("���̵� !,@,#,$,%,^,&�� ���ԵǸ� �ȵ˴ϴ�.");
	}else {
		System.out.println("ID�� " + ID + "�Դϴ�.");
		break;
				}
			}
		}
	}