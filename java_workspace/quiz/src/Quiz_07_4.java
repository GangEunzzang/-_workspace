class ThreeBtnMouse extends Mouse{
	public void Threebtn() {System.out.println("3��ư�� �������ϴ�.");}
}

public class Quiz_07_4 {

	public static void main(String[] args) {
		
		ThreeBtnMouse tbm = new ThreeBtnMouse();
		tbm.setName("3��ư ���콺");
		tbm.leftmouse();
		tbm.rightmouse();
		tbm.Threebtn();
		tbm.setMove(3234, 2123);
		tbm.MouseMove();
	}

}
