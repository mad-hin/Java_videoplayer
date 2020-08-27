package com.marco.player.main.logic;

import com.marco.player.main.player;

import javax.swing.*;
import java.io.File;

public class logic {
    player player;

    public logic(player player) {
        this.player = player;
    }

    public void openFile(JFileChooser fileChooser) {
        // open file chooser
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        String path = f.getPath();
    }
}
