import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextField extends JButton implements ActionListener {
  JFrame jframe;
  JButton button;
  JTextField textField;
  public MyTextField(){
    jframe = new JFrame();
    jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    jframe.setLayout(new FlowLayout());

    button = new JButton("summit");
    button.addActionListener(this);


    textField = new JTextField();
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("Consolas", Font.PLAIN,35));
    textField.setForeground(Color.GREEN);
    textField.setBackground(Color.yellow);
    textField.setCaretColor(Color.white);
    textField.setText("Username");


    jframe.add(textField);
    jframe.add(button);
    jframe.pack();
    jframe.setVisible(true);

  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
      System.out.println("welcome " + textField.getText());
      textField.setEditable(false);
      button.setEnabled(false);
    }
  }
}
