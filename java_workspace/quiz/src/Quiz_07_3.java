class MouseWhell extends Mouse{
	public void scroll() {System.out.println("��ũ���� �Դϴ�.");}
}
	
public class Quiz_07_3 {
	public static void main(String[] args) {
		MouseWhell mw = new MouseWhell();
		mw.setName("�ٸ��콺");
		mw.leftmouse();
		mw.rightmouse();
		mw.scroll();
		mw.setMove(33, 22);
		mw.MouseMove();	
	}
}
