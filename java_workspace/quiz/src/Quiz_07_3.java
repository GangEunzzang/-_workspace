class MouseWhell extends Mouse{
	public void scroll() {System.out.println("스크롤휠 입니다.");}
}
	
public class Quiz_07_3 {
	public static void main(String[] args) {
		MouseWhell mw = new MouseWhell();
		mw.setName("휠마우스");
		mw.leftmouse();
		mw.rightmouse();
		mw.scroll();
		mw.setMove(33, 22);
		mw.MouseMove();	
	}
}
