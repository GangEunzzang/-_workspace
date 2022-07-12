public class GetSet {

	public static void main(String[] args) {

		캐릭터 전사 = new 캐릭터();
		전사.set공격력(5);
		
		System.out.println(전사.get공격력());
		
			
		
	}

}


class 캐릭터 {

	private String id;
	private int 공격력;
	private int 속도;
	private int 방어력;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int get공격력() 
	{
		return 공격력;
	}
	public void set공격력(int 공격력) {
		if(공격력 > 0) this.공격력 = 공격력;
		else this.공격력 = 1;
	}
	public int get속도() {
		return 속도;
	}
	public void set속도(int 속도) {
		this.속도 = 속도;
	}
	public int get방어력() {
		return 방어력;
	}
	public void set방어력(int 방어력) {
		this.방어력 = 방어력;
	}

	
	
	
	
}