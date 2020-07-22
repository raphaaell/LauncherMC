package fr.raphew.launcher.ui.panel;

import fr.raphew.launcher.ui.PanelManager;
import javafx.animation.FadeTransition;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.util.Duration;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public class Panel implements iPanel{

    protected GridPane layout = new GridPane();
    protected PanelManager panelManager;

    @Override
    public void init(PanelManager panelManager) {
        this.panelManager = panelManager;
        GridPane.setHgrow(layout, Priority.ALWAYS);
        GridPane.setVgrow(layout, Priority.ALWAYS);
    }

    @Override
    public GridPane getlayout() {
        return this.layout;
    }

    @Override
    public void onShow() {
        FadeTransition transition = new FadeTransition(Duration.seconds(1), this.layout);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.setAutoReverse(true);
        transition.play();
    }
}
