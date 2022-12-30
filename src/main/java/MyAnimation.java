import javax.swing.JFrame;

public class MyAnimation extends JFrame {
  MyAnimationPanel panel;
  public MyAnimation(){
    panel = new MyAnimationPanel();

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

}
