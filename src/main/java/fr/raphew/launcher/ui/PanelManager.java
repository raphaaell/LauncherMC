package fr.raphew.launcher.ui;

import fr.arinonia.arilibfx.AriLibFX;
import fr.arinonia.arilibfx.ui.utils.ResizeHelper;
import fr.raphew.launcher.Launcher;
import fr.raphew.launcher.ui.panel.iPanel;
import fr.raphew.launcher.ui.panels.includes.TopPanel;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public class PanelManager {

    private final Launcher launcher;
    private final Stage stage;
    private GridPane layout;
    private TopPanel topPanel = new TopPanel();
    private GridPane centerPanel = new GridPane();

    public PanelManager(Launcher launcher, Stage stage) {
        this.launcher = launcher;
        this.stage = stage;
    }

    public void init(){
        this.stage.setTitle("Launcher Test");
        this.stage.setMinWidth(1280);
        this.stage.setWidth(1280);
        this.stage.setMinHeight(720);
        this.stage.setHeight(720);
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.centerOnScreen();
        this.stage.show();

        this.layout = new GridPane();
        this.layout.setStyle(AriLibFX.setResponsiveBackground("https://i.pinimg.com/originals/17/0e/da/170eda7473a17cd8c09e40d36a917f3c.jpg"));
        this.stage.setScene(new Scene(this.layout));

        RowConstraints topPanelConstraints = new RowConstraints();
        topPanelConstraints.setValignment(VPos.TOP);
        topPanelConstraints.setMinHeight(25);
        topPanelConstraints.setMaxHeight(25);
        this.layout.getRowConstraints().addAll(topPanelConstraints, new RowConstraints());
        this.layout.add(this.topPanel.getlayout(), 0, 0);
        this.topPanel.init(this);

        this.layout.add(this.centerPanel, 0 , 1);
        GridPane.setVgrow(this.centerPanel, Priority.ALWAYS);
        GridPane.setHgrow(this.centerPanel, Priority.ALWAYS);
        ResizeHelper.addResizeListener(this.stage);
    }

    public void showPanels(iPanel iPanel){
        this.centerPanel.getChildren().clear();
        this.centerPanel.getChildren().add(iPanel.getlayout());
        iPanel.init(this);
        iPanel.onShow();
    }

    // Getter
    public Stage getStage() { return stage; }
    public Launcher getLauncher() { return launcher; }
    public TopPanel getTopPanel() { return topPanel; }
}
