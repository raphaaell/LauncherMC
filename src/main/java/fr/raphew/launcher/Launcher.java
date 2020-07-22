package fr.raphew.launcher;

import fr.raphew.launcher.ui.PanelManager;
import fr.raphew.launcher.ui.panels.PanelLogin;
import javafx.stage.Stage;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public class Launcher {

    private PanelManager panelManager;

    public void init(Stage stage){
        this.panelManager = new PanelManager(this, stage);
        this.panelManager.init();
        this.panelManager.showPanels(new PanelLogin());
    }

}
