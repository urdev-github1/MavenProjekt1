package de.jdev.mavenprojekt1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;
//
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.PopupMenu;

//
public class App extends Application {

    public static Scene scene;

    //Die Startmethode legt ein root-Element fest, eine Szene und ordnet die Szene der Stage zu.
    @Override
    public void start(Stage primaryStage) throws IOException {

        //Die FXML-Datei wird aus den Ressourcen geladen.
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));

        //Die Scene festgelegt.
        scene = new Scene(root);

        //Die Scene (Szene) wird der Stage (Bühne) zugeordnet.
        primaryStage.setScene(scene);
        primaryStage.setTitle("????-Login");
        primaryStage.setResizable(false);

        //Die Stage anzeigen.
        primaryStage.show();

        //Anwendung nicht beenden, wenn das Passwortfenster geschlossen wird.
        Platform.setImplicitExit(false);

        // Beenden, wenn die Taskleiste das nicht unterstützt.
        if (!SystemTray.isSupported()) {
            System.out.println("Wird von der Taskleiste nicht unterstützt.");
            Platform.exit();
        }

        //Bilddatei laden
        java.awt.Image abasTrayIcon = new ImageIcon(this.getClass().getResource("/images/trayicon.png")).getImage();

        //Items Firmen
        final java.awt.MenuItem firma1 = new java.awt.MenuItem("Firma1");
        final java.awt.MenuItem firma2 = new java.awt.MenuItem("Firma2");
        final java.awt.MenuItem firma3 = new java.awt.MenuItem("Firma3");
        final java.awt.MenuItem firma4 = new java.awt.MenuItem("Firma4");
        final java.awt.MenuItem firma5 = new java.awt.MenuItem("Firma5");
        final java.awt.MenuItem firma6 = new java.awt.MenuItem("Firma6");
        final java.awt.MenuItem firma7 = new java.awt.MenuItem("Firma7");
        final java.awt.MenuItem firma8 = new java.awt.MenuItem("Firma8");
        final java.awt.MenuItem exitItem = new java.awt.MenuItem("Close");

        //Instanz des Popup-Menüs
        final PopupMenu popup = new PopupMenu();

        //Menüpunkte dem Menü hinzufügen.
        popup.add(firma8);
        popup.add(firma7);
        popup.add(firma6);
        popup.add(firma5);
        popup.add(firma4);
        popup.add(firma3);
        popup.add(firma2);
        popup.add(firma1);
        popup.add(exitItem);

        //Menü dem TrayIcon hinzufügen.
        TrayIcon trayIcon = new TrayIcon(abasTrayIcon, "MavenProjekt1", popup);

        //Instanz der Klasse SystemTray + TrayIcon in die Taskleiste einfügen.
        SystemTray tray = SystemTray.getSystemTray();

        try {
            tray.add(trayIcon);
        } catch(Exception e) {

        }















        //Exit-Event (Programm beenden).
        exitItem.addActionListener(event -> System.exit(0));








    }

    //
    public static void main(String[] args) {
        launch();
    }
}