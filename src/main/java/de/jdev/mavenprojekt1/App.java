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

    //lokale Variablen

    //Echt-Mandanten
    MenuItem mandant1;
    MenuItem mandant2;
    MenuItem mandant3;
    MenuItem mandant4;
    MenuItem mandant5;
    MenuItem mandant6;
    MenuItem mandant7;
    MenuItem mandant8;

    //Test-Mandanten
    MenuItem test1;
    MenuItem test2;
    MenuItem test3;
    MenuItem test4;
    MenuItem test5;
    MenuItem test6;
    MenuItem test7;
    MenuItem test8;

    //Demo-Mandanten
    MenuItem demo1;
    MenuItem demo2;
    MenuItem demo3;
    MenuItem demo4;
    MenuItem demo5;
    MenuItem demo6;
    MenuItem demo7;
    MenuItem demo8;

    //Beenden + Popup-Menü
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

        //Items der Echt-Mandanten erzeugen.
        mandant1 = new MenuItem("Mandant1");
        mandant2 = new MenuItem("Mandant2");
        mandant3 = new MenuItem("Mandant3");
        mandant4 = new MenuItem("Mandant4");
        mandant5 = new MenuItem("Mandant5");
        mandant6 = new MenuItem("Mandant6");
        mandant7 = new MenuItem("Mandant7");
        mandant8 = new MenuItem("Mandant8");

        //Items der Test-Mandanten erzeugen.
        test1 = new MenuItem("Test-Mandant1");
        test2 = new MenuItem("Test-Mandant2");
        test3 = new MenuItem("Test-Mandant3");
        test4 = new MenuItem("Test-Mandant4");
        test5 = new MenuItem("Test-Mandant5");
        test6 = new MenuItem("Test-Mandant6");
        test7 = new MenuItem("Test-Mandant7");
        test8 = new MenuItem("Test-Mandant8");

        //Items der Demo-Mandanten erzeugen.
        demo1 = new MenuItem("Demo-Mandant1");
        demo2 = new MenuItem("Demo-Mandant2");
        demo3 = new MenuItem("Demo-Mandant3");
        demo4 = new MenuItem("Demo-Mandant4");
        demo5 = new MenuItem("Demo-Mandant5");
        demo6 = new MenuItem("Demo-Mandant6");
        demo7 = new MenuItem("Demo-Mandant7");
        demo8 = new MenuItem("Demo-Mandant8");

        //Beenden
        exitItem = new MenuItem("Beenden");

        //Instanz des Popup-Menüs
        popup = new PopupMenu();

        //Echt-Mandant Items dem Menü hinzufügen.
        popup.add(mandant8);
        popup.add(mandant7);
        popup.add(mandant6);
        popup.add(mandant5);
        popup.add(mandant4);
        popup.add(mandant3);
        popup.add(mandant2);
        popup.add(mandant1);

        //Test-Mandant Items dem Menü hinzufügen.
        popup.add(test8);
        popup.add(test7);
        popup.add(test6);
        popup.add(test5);
        popup.add(test4);
        popup.add(test3);
        popup.add(test2);
        popup.add(test1);

        //Demo-Mandant Items dem Menü hinzufügen.
        popup.add(demo8);
        popup.add(demo7);
        popup.add(demo6);
        popup.add(demo5);
        popup.add(demo4);
        popup.add(demo3);
        popup.add(demo2);
        popup.add(demo1);

        //Item Beenden dem Menü zufügen
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
        mandant4.addActionListener(evtEchtMandanten);
        mandant5.addActionListener(evtEchtMandanten);
        mandant6.addActionListener(evtEchtMandanten);
        mandant7.addActionListener(evtEchtMandanten);
        mandant8.addActionListener(evtEchtMandanten);

        //Test-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtTestMandanten
        EvtTestMandanten evtTestMandanten = new EvtTestMandanten();

        //ActionListener Objekte den Items zuordnen.
        test1.addActionListener(evtEchtMandanten);
        test2.addActionListener(evtEchtMandanten);
        test3.addActionListener(evtEchtMandanten);
        test4.addActionListener(evtEchtMandanten);
        test5.addActionListener(evtEchtMandanten);
        test6.addActionListener(evtEchtMandanten);
        test7.addActionListener(evtEchtMandanten);
        test8.addActionListener(evtEchtMandanten);

        //Demo-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtDemoMandanten
        EvtDemoMandanten evtDemoMandanten = new EvtDemoMandanten();

        //ActionListener Objekte den Items zuordnen.
        demo1.addActionListener(evtEchtMandanten);
        demo2.addActionListener(evtEchtMandanten);
        demo3.addActionListener(evtEchtMandanten);
        demo4.addActionListener(evtEchtMandanten);
        demo5.addActionListener(evtEchtMandanten);
        demo6.addActionListener(evtEchtMandanten);
        demo7.addActionListener(evtEchtMandanten);
        demo8.addActionListener(evtEchtMandanten);
    }

    //
    public static void main(String[] args) {
        launch();
    }
}