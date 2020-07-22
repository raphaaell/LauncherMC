package fr.raphew.launcher.ui.panel;

import fr.raphew.launcher.ui.PanelManager;
import javafx.scene.layout.GridPane;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public interface iPanel {

    void init(PanelManager panelManager);
    GridPane getlayout();
    void onShow();
}
