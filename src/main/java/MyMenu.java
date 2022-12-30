import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends JFrame implements ActionListener {
  JFrame frame;
  JMenuBar menuBar;
  JMenuItem loadItem;
  JMenuItem saveItem;
  JMenuItem exitItem;
  ImageIcon loadIcon;
  ImageIcon saveIcon;
  ImageIcon exitIcon;
  public MyMenu(){
    frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    //Icons are too big
    loadIcon = new ImageIcon("resources/load.png");
    saveIcon = new ImageIcon("resources/save.png");
    exitIcon = new ImageIcon("resources/exit.png");


    menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    loadItem = new JMenuItem("Load");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    loadItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);

    loadItem.setIcon(loadIcon);
    saveItem.setIcon(saveIcon);
    exitItem.setIcon(exitIcon);

    fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
    editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
    helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
    loadItem.setMnemonic(KeyEvent.VK_L); // l for load
    saveItem.setMnemonic(KeyEvent.VK_S); // s for save
    exitItem.setMnemonic(KeyEvent.VK_E); // e for exit


    fileMenu.add(loadItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);


    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);

    frame.setJMenuBar(menuBar);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == loadItem){
      System.out.println("loaded");
    }else if(e.getSource() == saveItem){
      System.out.println("Saved");
    }else if(e.getSource() == exitItem){
      System.out.println("exited");
    }
  }
}
