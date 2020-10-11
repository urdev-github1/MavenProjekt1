package de.jdev.mavenprojekt1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
//
import java.awt.MenuItem;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.PopupMenu;

//
public class App extends Application {

    public static Scene scene;
    public static PrimaryController primaryController;

    public MenuItem mandant1;
    public MenuItem mandant2;

    //Die Startmethode legt ein root-Element fest, eine Szene und ordnet die Szene der Stage zu.
    @Override
    public void start(Stage primaryStage) throws IOException {

        //Die FXML-Datei wird über die statischen Methode [FXMLLoader.load()] aus dem Verzeichnis 'resources' geladen.
        //(Statische Methoden =	Methoden, die aufgerufen werden	können, ohne dass ein Objekt der Klasse	exisiert.)
        //Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));

        //VARIANTE: Eine Instanz anstelle der statischen FXMLLoader.load()-Methode verwenden!
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = fxmlLoader.load();

        //Über die Instanz erfolgt der Zugriff auf getController() => Typumwandlung beachten!
        //(Wird benötigt um das Passwort abzuftragen.)
        primaryController = (PrimaryController) fxmlLoader.getController();

        //Die Scene festgelegt.
        scene = new Scene(root);

        //Die Scene (Szene) wird der Stage (Bühne) zugeordnet.
        primaryStage.setScene(scene);
        primaryStage.setTitle("????-Login");
        primaryStage.setResizable(false);

        //Die Stage anzeigen.
        primaryStage.show();


//     ---------------------------------------------------------------------------------------------------------------------------------


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
        mandant1 = new MenuItem("Mandant1");
        mandant2 = new MenuItem("Mandant2");
        final java.awt.MenuItem mandant3 = new java.awt.MenuItem("Mandant3");
        final java.awt.MenuItem mandant4 = new java.awt.MenuItem("Mandant4");
        final java.awt.MenuItem mandant5 = new java.awt.MenuItem("Mandant5");
        final java.awt.MenuItem mandant6 = new java.awt.MenuItem("Mandant6");
        final java.awt.MenuItem mandant7 = new java.awt.MenuItem("Mandant7");
        final java.awt.MenuItem mandant8 = new java.awt.MenuItem("Mandant8");
        final java.awt.MenuItem exitItem = new java.awt.MenuItem("Schließen");

        //Instanz des Popup-Menüs
        final PopupMenu popup = new PopupMenu();

        //Menüpunkte dem Menü hinzufügen.
        popup.add(mandant8);
        popup.add(mandant7);
        popup.add(mandant6);
        popup.add(mandant5);
        popup.add(mandant4);
        popup.add(mandant3);
        popup.add(mandant2);
        popup.add(mandant1);
        popup.add(exitItem);

        //Menü dem TrayIcon hinzufügen.
        TrayIcon trayIcon = new TrayIcon(abasTrayIcon, "MavenProjekt1", popup);

        //Instanz der Klasse SystemTray + TrayIcon in die Taskleiste einfügen.
        SystemTray tray = SystemTray.getSystemTray();

        try {
            tray.add(trayIcon);
        } catch (Exception e) {

        }



        //Exit-Event (Programm beenden).
        exitItem.addActionListener(event -> System.exit(0));



//     ---------------------------------------------------------------------------------------------------------------------------------


        //Handler-Echtmandanten
        EvtEchtMandanten hEchtMandant = new EvtEchtMandanten();

        //
        mandant1.addActionListener(hEchtMandant);
        mandant2.addActionListener(hEchtMandant);


        }

    //
    public static void main(String[] args) {
        launch();
    }

//    //Inner Build Class
//    private class EvtSystemTray2 implements ActionListener {
//
//
//        public void actionPerformed(ActionEvent event) {
//
//            if (event.getSource() == mandant1) {
//                JOptionPane.showMessageDialog(null, "Hallo von " + event.getActionCommand());
//            }
//
//            if (event.getSource() == mandant2) {
//                JOptionPane.showMessageDialog(null, "Hallo von " + event.getActionCommand());
//            }
//        }
//    }
}