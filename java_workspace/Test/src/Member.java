
public class Member {
	String name,address;

	
	public void memberPrint() {
		System.out.println("�̸� :"+ name);
		System.out.println("�ּ� :" + address );
	}
	
	
	
	
	public static void main(String[] args) {
		Member mm = new Member();  // ��ü����
		
		mm.name = "�̰���";
		mm.address = "����";
		
		mm.memberPrint();
	}

}


