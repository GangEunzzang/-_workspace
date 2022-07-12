import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChartEx extends JFrame{
   private MyPanel panel=new MyPanel();
   
   public ChartEx() {
      this.setTitle("차트");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel.setBackground(Color.GRAY);
      this.setContentPane(panel);
      
      this.setSize(1000,1000);
      this.setVisible(true);
   }
   
   class MyPanel extends JPanel{

      @Override
      protected void paintComponent(Graphics g) {
         // TODO Auto-generated method stub
         super.paintComponent(g);
         
         int height=20;
         int gap=10;
         int q1=250;
         int q2=200;
         int q3=100;
         int q4=300;
         
         int gap2=50;
         
         g.setColor(Color.black);
         g.drawString("1/4분기", 400, 65);
         g.setColor(Color.magenta);
         g.fillRect(450, 50, q1, height);
        
         g.setColor(Color.black);
         g.drawString("2/4분기", 400, 65+height+gap);
         g.setColor(Color.WHITE);
         g.fillRect(450, 50+height+gap, q2, height);
         
         g.setColor(Color.black);
         g.drawString("3/4분기", 400, 65+(height+gap)*2);
         g.setColor(Color.green);
         g.fillRect(450, 50+(height+gap)*2, q3, height);


         g.setColor(Color.black);
         g.drawString("4/4분기", 400, 65+(height+gap)*3);
         g.setColor(Color.lightGray);
         g.fillRect(450, 50+(height+gap)*3, q4, height);
         
         
         g.setColor(Color.red);
         g.drawLine(100, 400, 100+50, 450-q1);
         g.drawLine(100+50, 450-q1, 100+gap2*2, 450-q2);
         g.drawLine(100+gap2*2, 450-q2, 100+gap2*3, 450-q3);         
         g.drawLine(100+gap2*3, 450-q3, 100+gap2*4, 450-q4);
         
         g.setColor(Color.black);
         g.drawLine(50,430, 50,100);                //y축 
         g.drawString("단위:억", 35, 450);
         g.drawString("0",30,430 );
         g.drawString("20", 25, 412 );
         g.drawString("40", 25, 394 );
         g.drawString("60", 25, 376 );
         g.drawString("80", 25, 358 );
         g.drawString("100", 20, 340 );
         g.drawString("120", 20, 322 );
         g.drawString("140", 20, 304 );
         g.drawString("160", 20, 286 );
         g.drawString("180", 20, 268 );
         g.drawString("200", 20, 450-q2);												
         g.drawString("220",20 ,232);
         g.drawString("240",20 ,214);
         g.drawString("260",20,196);
         g.drawString("280",20 ,178);
         g.drawString("300",20 ,160);
         g.drawString("320",20 ,142);
         g.drawString("340",20 ,124);
         g.drawString("360",20 ,106);
         
         g.drawLine(50,430,400,430);			//x축
         g.drawString("1분기", 140,450);
         g.drawString("2분기", 190,450);
         g.drawString("3분기", 240,450);
         g.drawString("4분기", 290,450);
         g.setColor(Color.black);
         g.drawString("분기", 400,450);
         
         g.setColor(Color.CYAN);
         g.drawOval(149, 450-q1, 4, 4);
         g.drawOval(99+gap2*2, 450-q2, 4, 4);
         g.drawOval(99+gap2*3, 450-q3, 4, 4);
         g.drawOval(99+gap2*4, 450-q4, 4, 4);
         
         
         
         
         g.setColor(Color.pink);						//파이차트
         g.fillArc(300, 600, 200, 200, 0, 106);
         g.setColor(Color.orange);
         g.fillArc(300, 600, 200, 200, 106, 85); 
         g.setColor(Color.blue);
         g.fillArc(300, 600, 200, 200, 191, 43);
         g.setColor(Color.green);
         g.fillArc(300, 600, 200, 200, 234, 131);
         
         g.setColor(Color.black);
         g.drawString("1분기", 415, 650);
         g.drawString("250억", 415, 670);
         
         g.drawString("2분기", 335, 655);
         g.drawString("200억", 335, 675);
        
         g.drawString("3분기", 335, 730);
         g.drawString("100억", 335, 745);
         
         g.drawString("4분기", 390, 740);
         g.drawString("300억", 390, 755);
         
         
      }
      
   }

   public static void main(String[] args) {
      new ChartEx();
   }

}