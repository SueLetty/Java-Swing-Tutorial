import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener extends JFrame implements MouseListener {
  JFrame frame;
  JLabel label;
  ImageIcon loveIcon;
  ImageIcon smileIcon;
  ImageIcon tearIcon;
  ImageIcon coolIcon;
  public MyMouseListener(){
    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    smileIcon = new ImageIcon("resources/smile.png");
    loveIcon = new ImageIcon("resources/love.png");
    tearIcon = new ImageIcon("resources/tear.png");
    coolIcon = new ImageIcon("resources/cool.png");

    label = new JLabel();
    label.setBounds(0,0,100,100);
//    label.setBackground(Color.red);
//    label.setOpaque(true);
    label.addMouseListener(this);
    label.setIcon(smileIcon);

//    frame.addMouseListener(this);
    frame.add(label);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
//    System.out.println("You clicked the mouse");
    label.setIcon(tearIcon);
  }

  @Override
  public void mousePressed(MouseEvent e) {
//    System.out.println("You pressed the mouse");
//    label.setBackground(Color.yellow);
    label.setIcon(coolIcon);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
//    System.out.println("You released the mouse");
//    label.setBackground(Color.green);
    label.setIcon(smileIcon);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
//    System.out.println("You entered the component");
//    label.setBackground(Color.blue);
    label.setIcon(coolIcon);

  }

  @Override
  public void mouseExited(MouseEvent e) {
//    System.out.println("you exited the component");
//    label.setBackground(Color.red);
    label.setIcon(loveIcon);
  }
}
