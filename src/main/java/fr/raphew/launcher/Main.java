package fr.raphew.launcher;

import fr.arinonia.arilibfx.utils.AriLogger;
import javafx.application.Application;

import javax.swing.*;

/**
 * This file of Launcher was created by Raphew on 22/07/2020
 */
public class Main {

    public static AriLogger logger;

    public static void main(String[] args) {
        logger = new AriLogger("Launcher");
        try {
            Class.forName("javafx.application.Application");
            Application.launch(FxApplication.class, args);
        }catch (ClassNotFoundException e){
            logger.warn("JavaFX not found :cry:");
            JOptionPane.showMessageDialog(null, "Une erreur avec Java à été détectée.\n" + e.getMessage() + "Not found", "Erreur Java", JOptionPane.ERROR_MESSAGE);
        }
    }
}
