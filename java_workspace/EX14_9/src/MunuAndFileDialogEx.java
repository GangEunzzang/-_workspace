import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class MunuAndFileDialogEx extends JFrame {
	private JLabel imageLabel = new JLabel();
	public MunuAndFileDialogEx() {
		this.setTitle("메뉴와 JFileChooser 활용 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.add(imageLabel);
		createMenu();
		this.setSize(350,200);
		this.setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF & PNG Images ",
					"jpg & gif & png"
					+ "");
			
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고",JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
	
		}
	}
	public static void main(String[] args) {
		new MunuAndFileDialogEx();
	}

}
