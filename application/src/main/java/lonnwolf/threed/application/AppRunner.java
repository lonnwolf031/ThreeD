package lonnwolf.threed.application;

import lonnwolf.threed.application.gui.MainUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */
@Component
public class AppRunner implements CommandLineRunner {


    @Autowired
    public AppRunner() {
    }


    @Override
    public void run(String... args) {
        //This boots up the GUI.
        EventQueue.invokeLater(() -> MainUI.mainFrame().setVisible(true));
    }
}