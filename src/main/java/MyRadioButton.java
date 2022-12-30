import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyRadioButton extends JButton implements ActionListener {
  JFrame jframe;
  JRadioButton pizzaButton;
  JRadioButton hamburgerButton;
  JRadioButton hotdogButton;

  ImageIcon pizzaIcon;
  ImageIcon hamburgerIcon;
  ImageIcon hotdogIcon;

  public MyRadioButton(){
    jframe = new JFrame();
    jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    jframe.setLayout(new FlowLayout());

    pizzaIcon = new ImageIcon("resources/pizza.png");
    hamburgerIcon = new ImageIcon("resources/hamburger.png");
    hotdogIcon = new ImageIcon("resources/hotdog.png");

    pizzaButton = new JRadioButton("pizza");
    hamburgerButton = new JRadioButton("hamburger");
    hotdogButton = new JRadioButton("hotdog");

    pizzaButton.addActionListener(this);
    hamburgerButton.addActionListener(this);
    hotdogButton.addActionListener(this);

    pizzaButton.setIcon(pizzaIcon);
    hamburgerButton.setIcon(hamburgerIcon);
    hotdogButton.setIcon(hotdogIcon);


    ButtonGroup group  = new ButtonGroup();
    group.add(pizzaButton);
    group.add(hamburgerButton);
    group.add(hotdogButton);

    jframe.add(pizzaButton);
    jframe.add(hamburgerButton);
    jframe.add(hotdogButton);


    jframe.pack();
    jframe.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == pizzaButton){
      System.out.println("Pizza");
    }else if(e.getSource() == hamburgerButton){
      System.out.println("Hamburger");
    }else if(e.getSource() == hotdogButton){
      System.out.println("Hot Dog");
    }else{
      System.out.println("You didn't choose any food");
    }
  }
}

