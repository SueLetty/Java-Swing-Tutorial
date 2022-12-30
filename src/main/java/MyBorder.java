import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBorder extends JFrame {
  JFrame jFrame;
  public MyBorder(){
    jFrame = new JFrame();
    jFrame.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    jFrame.setSize(750,750);
    jFrame.setLayout(new BorderLayout(10,10));
    jFrame.setVisible(true);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.yellow);
    panel4.setBackground(Color.magenta);
    panel5.setBackground(Color.blue);

    panel1.setPreferredSize(new Dimension(100,100));
    panel2.setPreferredSize(new Dimension(100,100));
    panel3.setPreferredSize(new Dimension(100,100));
    panel4.setPreferredSize(new Dimension(100,100));
    panel5.setPreferredSize(new Dimension(100,100));

    jFrame.add(panel1, BorderLayout.NORTH);
    jFrame.add(panel2, BorderLayout.WEST);
    jFrame.add(panel3, BorderLayout.EAST);
    jFrame.add(panel4, BorderLayout.SOUTH);
    jFrame.add(panel5, BorderLayout.CENTER);

    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    panel6.setBackground(Color.cyan);
    panel7.setBackground(Color.black);
    panel8.setBackground(Color.darkGray);
    panel9.setBackground(Color.white);
    panel10.setBackground(Color.lightGray);

    panel5.setLayout(new BorderLayout());

    panel6.setPreferredSize(new Dimension(50,50));
    panel7.setPreferredSize(new Dimension(50,50));
    panel8.setPreferredSize(new Dimension(50,50));
    panel9.setPreferredSize(new Dimension(50,50));
    panel10.setPreferredSize(new Dimension(50,50));

    panel5.add(panel6,BorderLayout.NORTH);
    panel5.add(panel7, BorderLayout.WEST);
    panel5.add(panel8, BorderLayout.EAST);
    panel5.add(panel9, BorderLayout.SOUTH);
    panel5.add(panel10, BorderLayout.CENTER);



  }
}
