import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGrid extends JFrame{
  JFrame jframe;
  public MyGrid() {
    jframe = new JFrame();
    jframe.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    jframe.setSize(750, 750);
    jframe.setLayout(new GridLayout());

    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(250,250));
    panel.setBackground(Color.lightGray);
    panel.setLayout(new GridLayout(5,2,10,0));

    panel.add(new JButton("1"));
    panel.add(new JButton("2"));
    panel.add(new JButton("3"));
    panel.add(new JButton("4"));
    panel.add(new JButton("5"));
    panel.add(new JButton("6"));
    panel.add(new JButton("7"));
    panel.add(new JButton("8"));
    panel.add(new JButton("9"));
    panel.add(new JButton("10"));

    jframe.add(panel);
    jframe.setVisible(true);
  }
}
