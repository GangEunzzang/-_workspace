import javax.swing.*;
import java.applet.*;
import java.awt.Graphics;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		this.setTitle("��� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);-
		this.setContentPane(panel);
		this.setSize(250,200);
		this.setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("����� ���ڴ� ��", 30, 30);
			g.drawString("�󸶳� ? �ϴø�ŭ ����ŭ ! ! ! !", 60, 60);
		}
	}
	
	
	
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}

