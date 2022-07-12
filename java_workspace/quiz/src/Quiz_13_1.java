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
		this.setTitle("¯���� ������");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout(30,50));
		
		JPanel MenuPanel = new JPanel();						// �޴� �г� ����
		MenuPanel.setBackground(Color.gray);				   // �г� ���ֱ�
		MenuPanel.setPreferredSize(new Dimension(300,300));    //�г� ũ�� ����
		
		this.btnLeft = new JButton(left);	
		this.btnLeft.setPreferredSize(new Dimension(250,250));	// ���� ��ư ũ�� ����
		this.btnLeft.addActionListener(new ActionListener() {	// ���ʹ�ư �͸�Ŭ���� ����
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
		this.btnRight.setPreferredSize(new Dimension(250,250)); // ������ ��ư ũ�� ����
		this.btnRight.addActionListener(new ActionListener() {  // �����ʹ�ư �͸�Ŭ���� ����
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
		
		c.add(MenuPanel,BorderLayout.SOUTH); 					// �г� �����̳� ���ʿ� ����
		c.add(imgLabel);										// �̹��� �����̳ʳ� ����
		
		MenuPanel.add(btnLeft,BorderLayout.EAST);
		MenuPanel.add(btnRight,BorderLayout.WEST);			// �гο� ȭ��ǥ ��ư ����
	
		this.setSize(800,800);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Quiz_13_1();
	}
}
