import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyComboBox extends JButton implements ActionListener {
  JFrame jframe;

  JComboBox comboBox;

  public MyComboBox(){
    jframe = new JFrame();
    jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    jframe.setLayout(new FlowLayout());

    String[] animals = {"dog", "cat", "cow"};
    comboBox = new JComboBox(animals);
    comboBox.addActionListener(this);

//    comboBox.setEditable(true);
//    System.out.println(comboBox.getItemCount());
//    comboBox.addItem("horse");
//    comboBox.insertItemAt("pig",0);
//    comboBox.setSelectedIndex(0);
//    comboBox.removeItem("cat");
//    comboBox.removeItemAt(0);
//    comboBox.removeAllItems();

    jframe.add(comboBox);
    jframe.pack();
    jframe.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == comboBox){
//      System.out.println(comboBox.getSelectedItem());
      System.out.println(comboBox.getSelectedIndex());
    }
  }
}

