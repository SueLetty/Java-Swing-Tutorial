import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyJLayeredPane extends JFrame {
  JFrame jframe;
  public MyJLayeredPane(){
    JLabel label1 = new JLabel();
    label1.setOpaque(true);
    label1.setBackground(Color.RED);
    label1.setBounds(50,50,200,200);

    JLabel label2 = new JLabel();
    label2.setOpaque(true);
    label2.setBackground(Color.GREEN);
    label2.setBounds(100,100,200,200);

    JLabel label3 = new JLabel();
    label3.setOpaque(true);
    label3.setBackground(Color.BLUE);
    label3.setBounds(150,150,200,200);

    JLayeredPane jLayeredPane = new JLayeredPane();
    jLayeredPane.setBounds(0,0,500,500);

    jLayeredPane.add(label1, Integer.valueOf(0));
    jLayeredPane.add(label2, Integer.valueOf(2));
    jLayeredPane.add(label3, Integer.valueOf(1));

    jframe = new JFrame();
    jframe.add(jLayeredPane);
    jframe.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    jframe.setSize(750, 750);
    jframe.setLayout(null);
    jframe.setVisible(true);
  }
}
