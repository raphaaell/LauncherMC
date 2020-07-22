package fr.raphew.launcher;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public class FxApplication extends Application {

    @Override
    public void start(Stage stage){
        new Launcher().init(stage);
    }
}
