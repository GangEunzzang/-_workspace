class Mouse{
	public String name;
	private int a;
	private int b;
	public void leftmouse() {System.out.println("���� ��ư�Դϴ�.");}
	public void rightmouse() {System.out.println("������ ��ư�Դϴ�.");}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public void setMove(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void MouseMove() {
		System.out.println("(" + a + "," + b + ")");
	}
}
		
public class Quiz_07_2 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.setName("�⺻���콺");
		mouse.setMove(10, 5);
		mouse.leftmouse();
		mouse.rightmouse();
		mouse.MouseMove();
	}
}
