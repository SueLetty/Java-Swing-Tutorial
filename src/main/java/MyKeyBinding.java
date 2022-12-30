import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;


public class MyKeyBinding {
  JFrame frame;
  JLabel label;
  Action upAction;
  Action downAction;
  Action leftAction;
  Action rightAction;

  public MyKeyBinding(){
    frame = new JFrame("Key Binding Demo");
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    label = new JLabel();
    label.setBackground(Color.red);
    label.setBounds(100,100,100,100);
    label.setOpaque(true);

    upAction = new UpAction();
    downAction = new DownAction();
    leftAction = new LeftAction();
    rightAction = new RightAction();

//    label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
    label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
    label.getActionMap().put("upAction",upAction);

//    label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
    label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
    label.getActionMap().put("downAction",downAction);

//    label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
    label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
    label.getActionMap().put("leftAction",leftAction);

//    label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
    label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
    label.getActionMap().put("rightAction",rightAction);

    frame.add(label);
    frame.setVisible(true);

  }
  public class UpAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX(),label.getY()-10);
    }
  }
  public class DownAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX(),label.getY()+10);

    }
  }
  public class LeftAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX()-10,label.getY());

    }
  }
  public class RightAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent e) {
      label.setLocation(label.getX()+10,label.getY());

    }
  }

}
