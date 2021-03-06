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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Haksa extends JFrame{
   JTextField tfId=null; //btnList, taList, cbFruits, ckbFood...
   JTextField tfName=null;
   JTextField tfDepartment=null;
   JTextField tfAddress=null;
   JTextArea taList=null;
   JButton btnSave=null;    // insert -> DB용어:Create
   JButton btnList=null;    // select ->      :Read
   JButton btnModify=null;  // update ->      :Update
   JButton btnRemove=null;  // delete ->      :Delete
   
   
   JButton btnSearch=null; // 검색버튼
   
   JMenuItem menuItem1=null; //학생정보
   
   DefaultTableModel model=null;//테이블에 들어가는 데이터
   JTable table=null; //테이블
   
   public Haksa() {
      this.setTitle("학사관리");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setLayout(new FlowLayout());
      
   
      
      
      
      JMenuBar mb=new JMenuBar();
      JMenu menu1=new JMenu("학생관리");
      this.menuItem1=new JMenuItem("학생정보");
      menu1.add(this.menuItem1);
      mb.add(menu1);
      this.setJMenuBar(mb);
      
      this.menuItem1.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e) {
            //화면전환, 학생정보화면을 그린다.
            System.out.println("학생정보화면 로딩...");
            
      }});
      
      
      
      
      this.add(new JLabel("학번"));
      this.tfId=new JTextField(14);
      this.add(this.tfId);
      
      this.btnSearch=new JButton("검색");
      this.add(this.btnSearch);
      this.btnSearch.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               //oracle jdbc드라이버 로드
               Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
               //Connection
               Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
               System.out.println("연결완료");
               
               Statement stmt=conn.createStatement();
               

               
               ResultSet rs=stmt.executeQuery("select * from student where id='"+tfId.getText()+"'");
               
               model.setRowCount(0);
               
               while(rs.next()) {
            	   String[] row=new String[3];//컬럼의 갯수가 3
					row[0]=rs.getString("id");
					row[1]=rs.getString("name");
					row[2]=rs.getString("dept");	
					
					model.addRow(row);
					
					tfId.setText(rs.getString("id"));
					tfName.setText(rs.getString("name"));
					tfDepartment.setText(rs.getString("dept"));
					
					
               }
               rs.close();
               stmt.close();
               conn.close();
            }catch(Exception e1) {
               e1.printStackTrace();
               }finally {}
            
         }});
      
      this.add(new JLabel("이름"));
      this.tfName=new JTextField(20);
      this.add(this.tfName);

      this.add(new JLabel("학과"));
      this.tfDepartment=new JTextField(20);
      this.add(this.tfDepartment);
      
      this.add(new JLabel("주소"));
      this.tfAddress=new JTextField(20);
      this.add(this.tfAddress);
      
      // this.taList=new JTextArea(17,23);
      // this.add(new JScrollPane(this.taList));
      String colName[]={"학번","이름","학과","주소"};
      this.model=new DefaultTableModel(colName,0);
      this.table = new JTable(this.model);
      this.table.setPreferredScrollableViewportSize(new Dimension(250,280)); //테이블 크기
      this.table.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			 table = (JTable)e.getComponent();//클릭한 테이블 구하기
			 model = (DefaultTableModel)table.getModel();
			 	
			 String no=(String)model.getValueAt(table.getSelectedRow(), 0); // 학번
		     tfId.setText(no);

		     String name=(String)model.getValueAt(table.getSelectedRow(), 1);  // 이름
		     tfName.setText(name);

			 String dept=(String)model.getValueAt(table.getSelectedRow(), 2);  // 학과
			 tfDepartment.setText(dept);

			 String address=(String)model.getValueAt(table.getSelectedRow(), 3);  // 주소
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
      
      
      this.btnSave=new JButton("등록");
      this.add(btnSave);
      this.btnSave.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("등록");

            try {
            //oracle jdbc드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
            //Connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
            System.out.println("연결완료");
            
            Statement stmt=conn.createStatement();
            
            
            stmt.executeUpdate("insert into student values('"+tfId.getText()+"', '"+tfName.getText()+"','"+tfDepartment.getText()+"')"); //영향을 받은 행의 수가 리턴됨

            
            ResultSet rs=stmt.executeQuery("select * from student");
            
            model.setRowCount(0);
            
            
            while(rs.next()) {
            	String[] row=new String[3];//컬럼의 갯수가 3
				row[0]=rs.getString("id");
				row[1]=rs.getString("name");
				row[2]=rs.getString("dept");					

				model.addRow(row);
            }
            rs.close();
            stmt.close();
            conn.close();
         }catch(Exception e1) {
            e1.printStackTrace();
            }finally {}
         }});
      
      
      this.btnList=new JButton("목록");
      
      this.btnList.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            
            try {
            //oracle jdbc드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
            //Connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
            System.out.println("연결완료");
            
            Statement stmt=conn.createStatement();
           
            
            ResultSet rs=stmt.executeQuery("select * from student");
            

             model.setRowCount(0);
                   while(rs.next()) {

                      String[] row = new String[3];
                      row[0]= rs.getString("id");
                      row[1]= rs.getString("name");
                      row[2]= rs.getString("dept");
                      
                      model.addRow(row);
       
            }
            rs.close();
            stmt.close();
            conn.close();
         }catch(Exception e1) {
            e1.printStackTrace();
            }finally {}
         }});
      
      
      this.add(btnList);
      
      this.btnModify=new JButton("수정");
      
           this.btnModify.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     
                     try {
                        //oracle jdbc드라이버 로드
                        Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
                        //Connection
                        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
                        System.out.println("연결완료");
                        
                        Statement stmt=conn.createStatement();
                           
                           
                           
                        stmt.executeUpdate("update student set name='"+tfName.getText()+"', dept='"+tfDepartment.getText()+"'where id='"+tfId.getText()+"'");

                           ResultSet rs=stmt.executeQuery("select * from student");
                           
                           model.setRowCount(0); // 목록초기화
                           
                           while(rs.next()) {
                        	   
                  
                             String[] row=new String[3];//컬럼의 갯수가 3
       						row[0]=rs.getString("id");
    						row[1]=rs.getString("name");
    						row[2]=rs.getString("dept");					

    						model.addRow(row);
                          }
    						rs.close();
                           stmt.close();
                           conn.close();
                        
                     }catch(Exception e1) {
                        e1.printStackTrace();
                        
                     }finally {}
                  }});   
      
      
      this.add(btnModify);
      
      this.btnRemove=new JButton("삭제");
      this.btnRemove.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
         }
      });
      
      
      this.btnRemove.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            int result=JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION) {
               //삭제처리
               JOptionPane.showMessageDialog(null, "삭제되었습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
               try {
                  //oracle jdbc드라이버 로드
                  Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
                  //Connection
                  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
                  System.out.println("연결완료");
                  
                  Statement stmt=conn.createStatement();

                  stmt.executeUpdate("delete from student where id='"+tfId.getText()+"'");
                  
                  ResultSet rs=stmt.executeQuery("select * from student");
                  
                 
                  model.setRowCount(0);
                  
                  while(rs.next()) {
                	  
                    String[] row=new String[3];//컬럼의 갯수가 3
   					row[0]=rs.getString("id");
   					row[1]=rs.getString("name");
   					row[2]=rs.getString("dept");	
   					
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
      this.add(btnRemove);
      
      this.setSize(300, 530);
      this.setVisible(true);
   }

   public static void main(String[] args) {
      new Haksa();
   }

}