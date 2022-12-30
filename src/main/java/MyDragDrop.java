import java.awt.FlowLayout;
import javax.swing.JFrame;


public class MyDragDrop extends JFrame{
  JFrame frame;
  DragPanel dragPanel = new DragPanel();
  public MyDragDrop(){

    frame = new JFrame("Drag and Drop Demo");
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.add(dragPanel);
    frame.setVisible(true);
  }
}
