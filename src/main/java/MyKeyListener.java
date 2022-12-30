import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyKeyListener extends JFrame implements KeyListener {
  JFrame frame;
  JLabel label;
  ImageIcon image;
  public MyKeyListener(){
    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.addKeyListener(this);

    image = new ImageIcon("resources/logo.png");

    label = new JLabel();
    label.setBounds(0,0,200,100);
//    label.setBackground(Color.red);
//    label.setOpaque(true);
    label.setIcon(image);

    frame.getContentPane().setBackground(Color.GREEN);
    frame.add(label);
    frame.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    switch(e.getKeyChar()){
      case 'a':
        label.setLocation(label.getX() - 10,label.getY());
        break;
      case 'w':
        label.setLocation(label.getX(), label.getY()-10);
        break;
      case 's':
        label.setLocation(label.getX(), label.getY() +10);
        break;
      case 'd':
        label.setLocation(label.getX()+10, label.getY());
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch(e.getKeyCode()){
      case 37:
        label.setLocation(label.getX() - 10,label.getY());
        break;
      case 38:
        label.setLocation(label.getX(), label.getY()-10);
        break;
      case 40:
        label.setLocation(label.getX(), label.getY() +10);
        break;
      case 39:
        label.setLocation(label.getX()+10, label.getY());
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("You released key char: " + e.getKeyChar());
    System.out.println("You released key code: " + e.getKeyCode());
  }
}
