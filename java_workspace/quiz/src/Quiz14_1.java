import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ThreadClock extends Thread{
	private JLabel la;
	public ThreadClock(JLabel la) {
		this.la= la;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				return ;
			}
		}
	}
}


public class Quiz14_1 extends JFrame {
	
	LocalDateTime now = LocalDateTime.now();
	String fullNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 HH시 mm분 ss초"));
	
	public Quiz14_1() {
		this.setTitle("디지털 시계");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel(fullNow);
		la.setLocation(150,150);
		la.setSize(200,100);
		c.add(la);
		
		ThreadClock haha = new ThreadClock(la);
		Thread th = new Thread(haha);
		
		this.setSize(500,500);
		this.setVisible(true);
		
		th.run();
		
	}
	

	public static void main(String[] args) {
		new Quiz14_1();
	
	}
}
