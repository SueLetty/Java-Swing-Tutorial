import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyColor extends JFrame implements ActionListener {
  JFrame frame;
  JButton button;
  JLabel label;
  public MyColor(){
    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    button = new JButton("Pick a color");
    button.addActionListener(this);

    label = new JLabel();
    label.setBackground(Color.white);
    label.setText("This is some text! ");
    label.setFont(new Font("MV Boli", Font.PLAIN, 50));
    label.setOpaque(true);


    frame.add(button);
    frame.add(label);
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
      JColorChooser colorChooser = new JColorChooser();

      Color color = JColorChooser.showDialog(null, "Pick a color .. I guess",Color.black );
//      label.setForeground(color);
      label.setBackground(color);
    }
  }
}
