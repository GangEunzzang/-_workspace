import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame{
	
	private JCheckBox [] fruites = new JCheckBox[3];
	private String [] names = {"시과", "배", "체리"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		this.setTitle("체크박스와 아이템이벤트 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruites.length; i++) {
			fruites[i] = new JCheckBox(names[i]);
			fruites[i].setBorderPainted(true);
			c.add(fruites[i]);
			fruites[i].addItemListener(listener);
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum =0;
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruites[0])
					sum += 100;
				else if (e.getItem() == fruites[1])
					sum += 500;
				else
					sum += 20000;			
			}
			else {
				if(e.getItem() == fruites[0])
					sum -= 100;
				else if (e.getItem() == fruites[1])
					sum -= 500;
				else 
					sum -= 20000;
			}
			sumLabel.setText("현재" + sum + "원 입니다.");
		
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
