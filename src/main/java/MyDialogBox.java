import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.MenuElement;

public class MyDialogBox {

  public MyDialogBox(){
//    JOptionPane.showMessageDialog(null, "This is message in the box","title", JOptionPane.PLAIN_MESSAGE);
//    JOptionPane.showMessageDialog(null, "This is message in the box","title", JOptionPane.INFORMATION_MESSAGE);
//    JOptionPane.showMessageDialog(null, "This is message in the box","title", JOptionPane.QUESTION_MESSAGE);
//    JOptionPane.showMessageDialog(null, "This is message in the box","title", JOptionPane.WARNING_MESSAGE);
//    JOptionPane.showMessageDialog(null, "This is message in the box","title", JOptionPane.ERROR_MESSAGE);
//    int answer = JOptionPane.showConfirmDialog(null, "Are you sure?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//    System.out.println(answer);

//    String name = JOptionPane.showInputDialog("What is your name?: ");
//    System.out.println("Hello, " + name);

    String[] responses = {"No, you're awesome!", "Thank you!","*blush*"};
    ImageIcon icon = new ImageIcon("resources/logo.png");
    JOptionPane.showOptionDialog(null,
        "You are awesome!",
        "title",JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        icon,
        responses,
        0);

  }
}
