public class GetSet {

	public static void main(String[] args) {

		ĳ���� ���� = new ĳ����();
		����.set���ݷ�(5);
		
		System.out.println(����.get���ݷ�());
		
			
		
	}

}


class ĳ���� {

	private String id;
	private int ���ݷ�;
	private int �ӵ�;
	private int ����;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int get���ݷ�() 
	{
		return ���ݷ�;
	}
	public void set���ݷ�(int ���ݷ�) {
		if(���ݷ� > 0) this.���ݷ� = ���ݷ�;
		else this.���ݷ� = 1;
	}
	public int get�ӵ�() {
		return �ӵ�;
	}
	public void set�ӵ�(int �ӵ�) {
		this.�ӵ� = �ӵ�;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}

	
	
	
	
}