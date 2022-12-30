import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class MyProgressBar {
  JFrame frame;
  JProgressBar bar;
  public MyProgressBar(){
    bar = new JProgressBar(0,500);
    bar.setValue(0);
    bar.setBounds(0,0,420,50);
    bar.setStringPainted(true);
    bar.setFont(new Font("MV boli", Font.BOLD, 25));
    bar.setForeground(Color.green);
    bar.setBackground(Color.black);

    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    frame.add(bar);
    frame.setVisible(true);

    fill();
  }
  public void fill(){
    int counter = 500;
    while(counter > 0){
      bar.setValue(counter);
      try{
        Thread.sleep(50);
      } catch (InterruptedException e){
        e.printStackTrace();
      }
      counter -= 1;
    }
    bar.setString("Done!");

  }
}
