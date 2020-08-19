package com.marco.player.main;

import com.marco.player.ui.UI;
import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.binding.RuntimeUtil;

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
        // set frame to be maximized
        mainFrame.setExtendedState(mainFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        // set close to stop programme
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make it resizable
        mainFrame.setResizable(true);
        // Initialize the Menu
        ui.InitMenu();
        // Make the frame visible
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new videoplayer();
        try {
            NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
        } catch (Error e) {
            System.out.println("Error in Line 32");
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
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
