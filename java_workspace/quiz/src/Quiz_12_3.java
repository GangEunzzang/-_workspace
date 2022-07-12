import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


public class Quiz_12_3 extends JFrame {
	
	static LocalDateTime now = LocalDateTime.now();
	public static final String FULL_NOW = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
	static int hour = now.getHour();
	public static JButton btn,btn2,btn3;
	static JLabel la = new JLabel();
	
	
	public Quiz_12_3() {
		this.setTitle("3번 문제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		
		la = new JLabel(FULL_NOW);
		la.setLocation(250,20);
		la.setSize(600,200);
		la.setFont(la.getFont().deriveFont(18.0f));
		c.add(la);
		
		
		btn = new JButton("버튼1");
		btn.setLocation(100,200);
		btn.setSize(100,100);
		c.add(btn);
		btn.addActionListener(new BtnListener(la));
		
		btn2 = new JButton("버튼2");
		btn2.setLocation(400,200);
		btn2.setSize(100,100);
		c.add(btn2);
		btn2.addActionListener(new Btn2Listener());
		
		btn3 = new JButton("버튼3");
		btn3.setLocation(700,200);
		btn3.setSize(100,100);
		c.add(btn3);
		
		
		this.setSize(1000,1000);
		this.setVisible(true);
	
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn3) {
					la.setText("익명클래스 " + FULL_NOW);
				}
			}
		});
	
	}

	class Btn2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn2) {
				la.setText("내부클래스 "+ FULL_NOW);
			}
		}
	}
	
	public static void main(String[] args) {
		new Quiz_12_3();
	}
}

class BtnListener implements ActionListener{   // 외부 클래스
	private JLabel la ;
	public BtnListener(JLabel la) {
		this.setLa(la);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
			if(e.getSource() == btn) {
				Quiz_12_3.la.setText("외부클래스" + Quiz_12_3.FULL_NOW);
			}
			
		}

	public JLabel getLa() {
		return la;
	}

	public void setLa(JLabel la) {
		this.la = la;
	}
	}






