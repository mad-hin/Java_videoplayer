package com.marco.player.main.logic;

import com.marco.player.main.videoplayer;

import javax.swing.*;
import java.io.File;

public class logic {
    videoplayer player;

    public logic(videoplayer player) {
        this.player = player;
    }

    public void openFile(JFileChooser fileChooser) {
        File f = fileChooser.getSelectedFile();
    }
}
