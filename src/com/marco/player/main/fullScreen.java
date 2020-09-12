package com.marco.player.main;

import uk.co.caprica.vlcj.player.embedded.fullscreen.adaptive.AdaptiveFullScreenStrategy;

import java.awt.*;

final class fullScreen extends AdaptiveFullScreenStrategy {
    fullScreen(Window window) {
        super(window);
    }
}
