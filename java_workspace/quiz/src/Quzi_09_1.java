import java.util.Scanner;

public class Quzi_09_1 {
	
	private static int i;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = "010101-123456";
		System.out.println(num.substring(0,6));   // 1번
		System.out.println("-----------------------");
		
		String tel ="010-1234-5678";
		System.out.println(tel.replace("-", "" ));    // 2번
		System.out.println("-----------------------");
		
		String goods ="E20160001";
		System.out.println(goods.charAt(0));       // 3번
		System.out.println("-----------------------");
		
		System.out.println(goods.substring(1,5));    // 4번
		System.out.println("-----------------------");
		
		String csv = "홍길동,010-1111-2222,hkd@hkd.com"; // 5번
		String[] result = csv.split(",");
		for(String a :result) {
			System.out.println(a);
		}System.out.println("-----------------------");
		
		String csv2 = "EL201800001,CH201800021,EN12231";  //6번
		String[] result2 = csv2.split(",");
		for(String a:result2) {
			if(a.equals("EL201800001")) {
				System.out.println(a.substring(2)+"-전자공학과");
			}else if(a.endsWith("CH201800021")) {
				System.out.println(a.substring(2)+"-화학공학과");
			}else {
				System.out.println(a.substring(2)+"-영어영문학과");
			}
		}System.out.println("-----------------------");
		
		
		
		
		while(true) {
		System.out.print("ID를 입력하시오 >> ");        //7번
		String ID = sc.next();	 
		if(ID.contains("!")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("@")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("#")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("$")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("%")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("^")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else if(ID.contains("&")) {
		System.out.println("아이디에 !,@,#,$,%,^,&가 포함되면 안됩니다.");
	}else {
		System.out.println("ID는 " + ID + "입니다.");
		break;
				}
			}
		}
	}