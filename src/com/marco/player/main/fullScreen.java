package com.marco.player.main;

import uk.co.caprica.vlcj.player.embedded.fullscreen.adaptive.AdaptiveFullScreenStrategy;

import java.awt.*;

public final class fullScreen extends AdaptiveFullScreenStrategy {
    public fullScreen(Window window) {
        super(window);
    }

    @Override
    protected void onBeforeEnterFullScreen() {
        super.onBeforeEnterFullScreen();
    }
}
