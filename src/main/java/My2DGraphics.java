
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class My2DGraphics extends JFrame{
  MyPanel panel;
  public My2DGraphics(){
    panel = new MyPanel();
    this.setSize(500,500);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }


}
