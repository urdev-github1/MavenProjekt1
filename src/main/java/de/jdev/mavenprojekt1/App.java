package de.jdev.mavenprojekt1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;
import java.awt.MenuItem;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.PopupMenu;

//Hauptprogramm
public class App extends Application {

    public static Scene scene;
    public static PrimaryController primaryController;

    //lokal
    MenuItem mandant1;
    MenuItem mandant2;
    MenuItem mandant3;
    MenuItem mandant4;
    MenuItem mandant5;
    MenuItem mandant6;
    MenuItem mandant7;
    MenuItem mandant8;
    MenuItem exitItem;
    PopupMenu popup;

    //Die Startmethode legt ein root-Element an, legt damit eine Szene fest und ordnet die Szene der Stage zu.
    @Override
    public void start(Stage primaryStage) throws IOException {

        //Die FXML-Datei wird über die statischen Methode [FXMLLoader.load()] aus dem Verzeichnis 'resources' geladen.
        //(Statische Methoden =	Methoden, die aufgerufen werden	können, ohne dass ein Objekt der Klasse	exisiert.)
        //Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));

        //VARIANTE: Eine fxmlLoader-Instanz anstelle der statischen FXMLLoader.load()-Methode verwenden!
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = fxmlLoader.load();

        //Über die Instanz erfolgt der Zugriff auf getController() => Typumwandlung beachten!
        //(Wird benötigt um das Passwort abzufragen.)
        primaryController = fxmlLoader.getController();

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

        //Items (Menüpunkte) der Echt-Mandanten.
        mandant1 = new MenuItem("Mandant1");
        mandant2 = new MenuItem("Mandant2");
        mandant3 = new MenuItem("Mandant3");
        mandant4 = new MenuItem("Mandant4");
        mandant5 = new MenuItem("Mandant5");
        mandant6 = new MenuItem("Mandant6");
        mandant7 = new MenuItem("Mandant7");
        mandant8 = new MenuItem("Mandant8");
        exitItem = new MenuItem("Beenden");

        //Instanz des Popup-Menüs
        popup = new PopupMenu();

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
            System.out.println("Das System-Tray konnte nicht gestartet werden.");
        }

        //Exit-Event (Programm beenden).
        exitItem.addActionListener(event -> System.exit(0));



//     ---------------------------------------------------------------------------------------------------------------------------------


        //Echt-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtEchtMandanten
        EvtEchtMandanten evtEchtMandanten = new EvtEchtMandanten();

        //ActionListener Objekte den Items zuordnen.
        mandant1.addActionListener(evtEchtMandanten);
        mandant2.addActionListener(evtEchtMandanten);
        mandant3.addActionListener(evtEchtMandanten);

        }

    //
    public static void main(String[] args) {
        launch();
    }
}