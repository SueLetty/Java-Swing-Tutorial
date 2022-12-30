import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.FlowLayout;
    import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
    import javax.swing.JTextField;

public class MyCheckBox extends JButton implements ActionListener {
  JFrame jframe;
  JCheckBox checkBox;
  JButton button;
  ImageIcon xIcon;
  ImageIcon checkIcon;
  public MyCheckBox(){
    jframe = new JFrame();
    jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    jframe.setLayout(new FlowLayout());

    xIcon = new ImageIcon("resources/x.png");
    checkIcon = new ImageIcon("resources/check.png");

    button = new JButton("submit");
    button.addActionListener(this);


    checkBox = new JCheckBox();
    checkBox.setText("I am not a robot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
    checkBox.setIcon(xIcon);
    checkBox.setSelectedIcon(checkIcon);

    jframe.add(checkBox);
    jframe.add(button);
    jframe.pack();
    jframe.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
      System.out.println(checkBox.isSelected());
    }
  }
}

