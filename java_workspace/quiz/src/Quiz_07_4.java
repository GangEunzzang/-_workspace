class ThreeBtnMouse extends Mouse{
	public void Threebtn() {System.out.println("3버튼을 눌렀습니다.");}
}

public class Quiz_07_4 {

	public static void main(String[] args) {
		
		ThreeBtnMouse tbm = new ThreeBtnMouse();
		tbm.setName("3버튼 마우스");
		tbm.leftmouse();
		tbm.rightmouse();
		tbm.Threebtn();
		tbm.setMove(3234, 2123);
		tbm.MouseMove();
	}

}
