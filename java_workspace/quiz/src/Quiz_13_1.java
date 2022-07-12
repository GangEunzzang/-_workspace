import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_13_1 extends JFrame {

	private String[] cute = {"zzangu","zzanga","white"}; 

	private ImageIcon [] images = {
			new ImageIcon ("images/zzangu.jpg"),
			new ImageIcon ("images/zzanga.jpg"),
			new ImageIcon ("images/white.jpg")};
	
	private ImageIcon left = new ImageIcon("images/left.png");
	private ImageIcon right = new ImageIcon("images/right.png");
	
	private int index = 0;
	private JLabel imgLabel = new JLabel(images[index]);
	
	JButton btnLeft = null;
	JButton btnRight = null;
	
	
	public Quiz_13_1() {
		this.setTitle("짱구는 못말려");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout(30,50));
		
		JPanel MenuPanel = new JPanel();						// 메뉴 패널 생성
		MenuPanel.setBackground(Color.gray);				   // 패널 색넣기
		MenuPanel.setPreferredSize(new Dimension(300,300));    //패널 크기 조정
		
		this.btnLeft = new JButton(left);	
		this.btnLeft.setPreferredSize(new Dimension(250,250));	// 왼쪽 버튼 크기 조정
		this.btnLeft.addActionListener(new ActionListener() {	// 왼쪽버튼 익명클래서 생성
			public void actionPerformed(ActionEvent e) {
				if(index == 0) {
					index = 2;
					imgLabel.setIcon(images[index]);
				}else if (index == 1) {
					index --;
					imgLabel.setIcon(images[index]);
				}else {
					index --;
					imgLabel.setIcon(images[index]);
						}
					}
			});
		
		this.btnRight = new JButton(right);
		this.btnRight.setPreferredSize(new Dimension(250,250)); // 오른쪽 버튼 크기 조정
		this.btnRight.addActionListener(new ActionListener() {  // 오른쪽버튼 익명클래스 생성
			public void actionPerformed(ActionEvent e) {
					if(index == 0) {							
						index++;
						imgLabel.setIcon(images[index]);
					}else if (index == 1) {
						index ++;
						imgLabel.setIcon(images[index]);
					}else {
						index = 0;
						imgLabel.setIcon(images[index]);
					}
			}
			}
		);
		
		c.add(MenuPanel,BorderLayout.SOUTH); 					// 패널 컨테이너 남쪽에 삽입
		c.add(imgLabel);										// 이미지 컨테이너네 삽입
		
		MenuPanel.add(btnLeft,BorderLayout.EAST);
		MenuPanel.add(btnRight,BorderLayout.WEST);			// 패널에 화살표 버튼 삽입
	
		this.setSize(800,800);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Quiz_13_1();
	}
}
