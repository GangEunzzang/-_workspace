import java.awt.*;
import javax.swing.*;

public class Quiz_12_1 extends JFrame {

	public Quiz_12_1() {
		this.setTitle("1�� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 50,50));
		c.add(new JLabel("�̸�"));
		c.add(new JTextField("",10));
		c.add(new JLabel("�й�"));
		c.add(new JTextField("",10));
		c.add(new JLabel("�а�"));
		c.add(new JTextField("",10));
		c.add(new JLabel("����"));
		c.add(new JTextField("",10));
		
		this.setSize(300,400);
		this.setVisible(true);
	}
		
	public static void main(String[] args) {
		new Quiz_12_1();
	}

}
