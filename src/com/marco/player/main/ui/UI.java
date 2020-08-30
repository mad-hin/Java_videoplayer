package com.marco.player.main.ui;

import com.marco.player.main.player;

import javax.swing.*;
import java.awt.*;

public class UI {
    player player;

    public UI(player player) {
        this.player = player;
    }

    // Init the menu bar
    public void InitMenu() {
        player.menuBar = new JMenuBar();

        // Media part
        player.media = new JMenu("Media");

        // open file
        player.openFile = new JMenuItem("Open File");
        player.openFile.setActionCommand("open");
        player.openFile.addActionListener(player);
        player.openFile.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        player.media.add(player.openFile);

        // Separator
        player.media.add(new JSeparator(SwingConstants.HORIZONTAL));

        // Quit
        player.quitApp = new JMenuItem("Quit");
        player.quitApp.setActionCommand("quit");
        player.quitApp.addActionListener(player);
        player.quitApp.setAccelerator(KeyStroke.getKeyStroke('Q', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        player.media.add(player.quitApp);

        player.menuBar.add(player.media);
        player.mainFrame.setJMenuBar(player.menuBar);
    }

    // Init the UI
    public void UInit() {
        player.mainFrame.add(player.buttonPanel, BorderLayout.SOUTH);
    }

    // Init the UI setting
    public void UIsetting() {
        // set frame to be maximized
        player.mainFrame.setExtendedState(player.mainFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        // set close to stop programme
        player.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make it resizable
        player.mainFrame.setResizable(true);
    }
}
