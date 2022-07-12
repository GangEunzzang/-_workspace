
public class Member {
	String name,address;

	
	public void memberPrint() {
		System.out.println("이름 :"+ name);
		System.out.println("주소 :" + address );
	}
	
	
	
	
	public static void main(String[] args) {
		Member mm = new Member();  // 객체생성
		
		mm.name = "이강은";
		mm.address = "대전";
		
		mm.memberPrint();
	}

}


