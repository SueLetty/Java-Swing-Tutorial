import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
  JButton button;
  JLabel jLabel;
  public MyFrame(){
    ImageIcon image = new ImageIcon("resources/logo.png");
    Border border = BorderFactory.createLineBorder(Color.RED,3);
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(255,255,1));

    button = new JButton("I'm a button");
    button.setBounds(250,100,300,250);
//    button.addActionListener(e-> System.out.println("poo"));
    button.addActionListener(this);
    button.setFocusable(false);
    button.setIcon(image);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans", Font.BOLD,25));
    button.setIconTextGap(-5);
    button.setForeground(Color.cyan);
    button.setBackground(Color.gray);
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setEnabled(true);




    jLabel = new JLabel("Where is Nick?");
    jLabel.setIcon(image);
    jLabel.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTER, RIGHT of ImageIcon
    jLabel.setVerticalTextPosition(JLabel.TOP);
    jLabel.setForeground(Color.GREEN);
    jLabel.setFont(new Font("MV Boli", Font.PLAIN,20));
    jLabel.setIconTextGap(10);
    jLabel.setBackground(Color.black);
    jLabel.setOpaque(true);//display background color
    jLabel.setBorder(border);
    jLabel.setVerticalAlignment(JLabel.TOP);
    jLabel.setHorizontalAlignment(JLabel.CENTER);
    jLabel.setBounds(0,0,250,250);
    jLabel.setVisible(false);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0,0,250,250);
    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250,0,250,250);
    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0,250,500,250);
    greenPanel.setLayout(new BorderLayout());


    this.setTitle("this title goes here");
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setLayout(null);
//    this.setResizable(false);
    this.setSize(750,750);
    this.setVisible(true);
//    redPanel.add(jLabel);
//    this.add(redPanel);
//    this.add(bluePanel);
//    this.add(greenPanel);
    this.add(button);
    this.add(jLabel);

//    this.pack();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
//      System.out.println("poo");
//      button.setEnabled(false);
      jLabel.setVisible(true);
    }
  }
}
