import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel{
	JTextField tfId=null;  
	JTextField tfName=null;
	JTextField tfDepartment=null;
	JTextField tfAddress=null;
	JTextArea taList=null;
	JButton btnSave=null;  // insert -> Create
	JButton btnList=null;  // select -> Read 
	JButton btnModify=null;// update -> Update
	JButton btnRemove=null;// delete -> Delete
	
	JButton btnSearch=null; // �˻���ư
	
	JMenuItem menuItem1=null; //�л�����
	
	DefaultTableModel model=null; // ���̺� ���� ������
	JTable table=null; // ���̺�
	public Student() {

		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("�й�"));
		this.tfId=new JTextField(14);
		this.add(this.tfId);
		
		this.btnSearch=new JButton("�˻�");
		this.add(this.btnSearch);
		this.btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
					//Connection
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
					System.out.println("����Ϸ�");
					
					Statement stmt=conn.createStatement();		
					
					ResultSet rs=stmt.executeQuery("select * from student where id='"+tfId.getText()+"'");
					
					model.setRowCount(0);//����ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];//�÷��� ������ 4
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						
						model.addRow(row);
						
						tfId.setText(rs.getString("id"));
						tfName.setText(rs.getString("name"));
						tfDepartment.setText(rs.getString("dept"));
						tfAddress.setText(rs.getString("address"));
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		
		this.add(new JLabel("�̸�"));		
		this.tfName=new JTextField(20);
		this.add(this.tfName);
		
		this.add(new JLabel("�а�"));
		this.tfDepartment=new JTextField(20);
		this.add(this.tfDepartment);
		
		this.add(new JLabel("�ּ�"));
		this.tfAddress=new JTextField(20);
		this.add(this.tfAddress);
		
		//this.taList=new JTextArea(17,23);
		//this.add(new JScrollPane(this.taList));
		String colName[]={"�й�","�̸�","�а�","�ּ�"};
		this.model=new DefaultTableModel(colName,0);
		this.table = new JTable(this.model);
		this.table.setPreferredScrollableViewportSize(new Dimension(250,300));//���̺�ũ�� 250px X 300px
		this.table.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {			
				 table=(JTable)e.getComponent();//Ŭ���� ���̺� ���ϱ�
				 model=(DefaultTableModel)table.getModel(); //���̺��� �� ���ϱ�
				 String no=(String)model.getValueAt(table.getSelectedRow(), 0);//�й�
 			     tfId.setText(no);
 			     String name=(String)model.getValueAt(table.getSelectedRow(), 1);//�̸�
 			     tfName.setText(name);
 			     String dept=(String)model.getValueAt(table.getSelectedRow(), 2);//�а�
			     tfDepartment.setText(dept);
			     String address=(String)model.getValueAt(table.getSelectedRow(), 3);//�ּ�
			     tfAddress.setText(address);
			     
			}

			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
		});
		JScrollPane sp=new JScrollPane(this.table);
		
		this.add(sp);
		
		this.btnSave=new JButton("���");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
					//Connection
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
					System.out.println("����Ϸ�");
					
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate("insert into student values('"+tfId.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"','"+tfAddress.getText()+"')"); //������ ���� ���� ���� ���ϵ�
										
					ResultSet rs=stmt.executeQuery("select*from student");
					model.setRowCount(0);
					
					while(rs.next()) {
						String[] row=new String[4];//�÷��� ������ 3
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
			}});
		
		
		this.btnList = new JButton("���");
		this.btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//oracle jdbc����̹� �ε�
					Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
					//Connection
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
					System.out.println("����Ϸ�");
					
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from student");					
					model.setRowCount(0);//����ʱ�ȭ
					while(rs.next()) {						
											
						String[] row=new String[4];//�÷��� ������ 3
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");					
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
					
				}
				
			}});
		
		this.add(this.btnList);
		this.btnModify = new JButton("����");
		this.btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//oracle jdbc����̹� �ε�
					Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
					//Connection
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
					System.out.println("����Ϸ�");
					
					Statement stmt = conn.createStatement();					

					stmt.executeUpdate("update student set name='"+tfName.getText()+"',dept='"+tfDepartment.getText()+"',address='"+tfAddress.getText()+"' where id='"+tfId.getText()+"'");

					ResultSet rs = stmt.executeQuery("select * from student");					
					
					model.setRowCount(0);//����ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];//�÷��� ������ 4
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
						
					}
					rs.close();
					stmt.close();
					conn.close();
				}
				catch(Exception e1) {
					e1.printStackTrace();
					
				}
				
			}});
		
		this.add(this.btnModify);
		this.btnRemove = new JButton("����");
		this.btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?","Confirm",JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION) {
					try {
						//oracle jdbc����̹� �ε�
						Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
						//Connection
						Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
						System.out.println("����Ϸ�");
						
						Statement stmt=conn.createStatement();						
						stmt.executeUpdate("delete from student where id='"+tfId.getText()+"'");
						
						ResultSet rs=stmt.executeQuery("select * from student");						
						model.setRowCount(0);//����ʱ�ȭ
						while(rs.next()) {
							String[] row=new String[4];//�÷��� ������ 4
							row[0]=rs.getString("id");
							row[1]=rs.getString("name");
							row[2]=rs.getString("dept");
							row[3]=rs.getString("address");
							model.addRow(row);
						}
						rs.close();
						stmt.close();
						conn.close();
					}catch(Exception e1) {
						e1.printStackTrace();
					   }finally {}
				}
			}});
		this.add(this.btnRemove);
		
		this.setSize(260, 550);
		this.setVisible(true);
	}
}
