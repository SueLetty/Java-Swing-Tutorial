import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class MyFile extends JFrame implements ActionListener {
  JFrame frame;
  JButton jButton;
;
  public MyFile(){
    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    jButton = new JButton("Select File");
    jButton.addActionListener(this);


    frame.add(jButton);
    frame.setVisible(true);
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == jButton){
      JFileChooser fileChooser = new JFileChooser();

      fileChooser.setCurrentDirectory(new File("C:\\Users\\wuxx\\Desktop\\TLG")); // current Directory
//      int response = fileChooser.showOpenDialog(null); // select file to open
      int response = fileChooser.showSaveDialog(null); // select file to save
      if(response == JFileChooser.APPROVE_OPTION){
        File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
        System.out.println(file);
      }
    }
  }
}

