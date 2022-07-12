import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Quiz_12_2 extends JFrame {

	static LocalDateTime now = LocalDateTime.now();
	static String fullNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
	//static String hours = now.format(DateTimeFormatter.ofPattern("HH"));
	static int hour = now.getHour();
	
	public Quiz_12_2() {
		this.setTitle("2번 문제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel(Integer.toString(hour));
		la.setLocation(50,50);
		la.setSize(100,100);
		c.add(la);
		
		if(hour < 12) la.setText("Good Morning"); 		
		else if(hour < 18) la.setText("Good Afternoon"); 		
		else if(hour > 18) la.setText("Good Evening"); 		
		
		this.setSize(300,300);
		this.setVisible(true);
	}
		
	public static void main(String[] args) {
		new Quiz_12_2();
	}

}
