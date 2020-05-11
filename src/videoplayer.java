import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class videoplayer extends JFrame implements ActionListener {
    public JPanel mainPenal = new JPanel();

    videoplayer() {
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(this);
        setVisible(true);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu media = new Menu("Media");
        MenuItem openFile = new MenuItem("Open File");
        openFile.setActionCommand("open");
        openFile.addActionListener(this);
        media.add(openFile);
        menuBar.add(media);
    }

    public static void main(String[] args) {
        videoplayer v = new videoplayer();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "open":
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
        }
    }
}