package com.marco.player;

import com.marco.player.ui.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class videoplayer implements ActionListener {
    public JFrame mainFrame = new JFrame("Video Player");
    public JMenuBar menuBar;
    public JMenu media;
    public JMenuItem openFile, quitApp;

    UI ui = new UI(this);

    public videoplayer() {
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(true);
        ui.InitMenu();
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new videoplayer();
        try {
            // set the file explore in window like (although I don't think it is look like windows' one)
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
            case "quit":
                System.exit(0);
        }
    }
}
