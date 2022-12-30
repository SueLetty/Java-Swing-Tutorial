import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MyJSlider implements ChangeListener {
  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;

  public MyJSlider(){
    frame = new JFrame("Slider Demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0,100,50);

    panel.add(slider);
    panel.add(label);
    frame.add(panel);

    slider.setPreferredSize(new Dimension(400,200));

    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(5);

    slider.setPaintTrack(true);
    slider.setMajorTickSpacing(25);

    slider.setPaintLabels(true);
    slider.setFont(new Font("MV Boli", Font.PLAIN,15));
    label.setFont(new Font("MV Boli", Font.PLAIN,15));

    slider.setOrientation(SwingConstants.VERTICAL);
//    slider.setOrientation(SwingConstants.HORIZONTAL);

    slider.addChangeListener(this);


    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    label.setText("°C = " + slider.getValue());
  }
}

