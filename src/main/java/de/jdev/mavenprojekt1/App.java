package de.jdev.mavenprojekt1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

//Hauptprogramm
public class App extends Application {

    public static Scene scene;
    public static PrimaryController primaryController;

    //Testmodus eingeschaltet, wenn die Variable testmodus=true
    Boolean testmodus = true;

    //-------------------------------------------------------------------------------------------------------------------------------------

    //Mandantennamen
    String firma1 = "firma1";
    String firma2 = "firma2";
    String firma3 = "firma3";
    String firma4 = "firma4";
    String firma5 = "firma5";
    String firma6 = "firma6";
    String firma7 = "firma7";
    String firma8 = "firma8";

    //Buttontexte Echtmandanten
    String echtBez1 = "Firma1";
    String echtBez2 = "Firma2";
    String echtBez3 = "Firma3";
    String echtBez4 = "Firma4";
    String echtBez5 = "Firma5";
    String echtBez6 = "Firma6";
    String echtBez7 = "Firma7";
    String echtBez8 = "Firma8";
    
    //Buttontexte Testtmandanten
    String testBez1 = "test" + firma1;
    String testBez2 = "test" + firma2;
    String testBez3 = "test" + firma3;
    String testBez4 = "test" + firma4;
    String testBez5 = "test" + firma5;
    String testBez6 = "test" + firma6;
    String testBez7 = "test" + firma7;
    String testBez8 = "test" + firma8;

    //Buttontexte Demotmandanten
    String demoBez1 = "demo" + firma1;
    String demoBez2 = "demo" + firma2;
    String demoBez3 = "demo" + firma3;
    String demoBez4 = "demo" + firma4;
    String demoBez5 = "demo" + firma5;
    String demoBez6 = "demo" + firma6;
    String demoBez7 = "demo" + firma7;
    String demoBez8 = "demo" + firma8;

    //Stage
    Stage pwFenster;        //Passwortfenster

    //Button Echt-Mandanten
    MenuItem echt1;
    MenuItem echt2;
    MenuItem echt3;
    MenuItem echt4;
    MenuItem echt5;
    MenuItem echt6;
    MenuItem echt7;
    MenuItem echt8;

    //Unterverzeichnis für die Test-Mandanten
    Menu testMandant;

    //Button Test-Mandanten
    MenuItem test1;
    MenuItem test2;
    MenuItem test3;
    MenuItem test4;
    MenuItem test5;
    MenuItem test6;
    MenuItem test7;
    MenuItem test8;

    //Unterverzeichnis für die Demo-Mandanten.
    Menu demoMandant;

    //Button Demo-Mandanten
    MenuItem demo1;
    MenuItem demo2;
    MenuItem demo3;
    MenuItem demo4;
    MenuItem demo5;
    MenuItem demo6;
    MenuItem demo7;
    MenuItem demo8;

    //Loginwechsel
    CheckboxMenuItem loginwechsel;

    //Freischalten Demomandant + Beenden.
    MenuItem freiItem;
    MenuItem exitItem;

    //Popup-Menü
    PopupMenu popup;

    //-------------------------------------------------------------------------------------------------------------------------------------

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

        //---------------------------------------------------------------------------------------------------------------------------------

        //Anwendung nicht beenden, wenn das Passwortfenster geschlossen wird.
        Platform.setImplicitExit(false);

        // Beenden, wenn die Taskleiste das nicht unterstützt.
        if (!SystemTray.isSupported()) {
            System.out.println("Wird von der Taskleiste nicht unterstützt.");
            Platform.exit();
        }

        //Bilddatei laden
        java.awt.Image abasTrayIcon = new ImageIcon(this.getClass().getResource("/images/trayicon.png")).getImage();

        //---------------------------------------------------------------------------------------------------------------------------------

        //Items der Echt-Mandanten erzeugen.
        echt1 = new MenuItem(echtBez1);
        echt2 = new MenuItem(echtBez2);
        echt3 = new MenuItem(echtBez3);
        echt4 = new MenuItem(echtBez4);
        echt5 = new MenuItem(echtBez5);
        echt6 = new MenuItem(echtBez6);
        echt7 = new MenuItem(echtBez7);
        echt8 = new MenuItem(echtBez8);

        //Unterverzeichnis für die Test-Mandanten
        testMandant = new Menu("Test-Mandanten");

        //Items im Verzeichnis 'Test-Mandanten' erzeugen.
        test1 = new MenuItem(testBez1);
        test2 = new MenuItem(testBez2);
        test3 = new MenuItem(testBez3);
        test4 = new MenuItem(testBez4);
        test5 = new MenuItem(testBez5);
        test6 = new MenuItem(testBez6);
        test7 = new MenuItem(testBez7);
        test8 = new MenuItem(testBez8);

        //Unterverzeichnis für die Demo-Mandanten
        demoMandant = new Menu("Demo-Mandanten");

        //Items im Verzeichnis 'Demo-Mandanten' erzeugen.
        demo1 = new MenuItem(demoBez1);
        demo2 = new MenuItem(demoBez2);
        demo3 = new MenuItem(demoBez3);
        demo4 = new MenuItem(demoBez4);
        demo5 = new MenuItem(demoBez5);
        demo6 = new MenuItem(demoBez6);
        demo7 = new MenuItem(demoBez7);
        demo8 = new MenuItem(demoBez8);
        //Demomandanten freischalten
        freiItem = new MenuItem("* Freischalten *");

        //Items Loginwechsel + Beenden
        loginwechsel = new CheckboxMenuItem("Login-Wechsel",false);
        exitItem = new MenuItem("Beenden");

        //---------------------------------------------------------------------------------------------------------------------------------

        //Instanz des Popup-Menüs
        popup = new PopupMenu();

        //Echt-Mandant Items dem Menü hinzufügen.
        popup.add(echt8);
        popup.add(echt7);
        popup.add(echt6);
        popup.add(echt5);
        popup.add(echt4);
        popup.add(echt3);
        popup.add(echt2);
        popup.add(echt1);

        popup.addSeparator();

        //Testunterverzeichnis zufügen.
        popup.add(testMandant);
        //Items in das Unterverzeichnis.
        testMandant.add(test8);
        testMandant.add(test7);
        testMandant.add(test6);
        testMandant.add(test5);
        testMandant.add(test4);
        testMandant.add(test3);
        testMandant.add(test2);
        testMandant.add(test1);

        //Demounterverzeichnis zufügen.
        popup.add(demoMandant);
        //Items in das Unterverzeichnis.
        demoMandant.add(demo8);
        demoMandant.add(demo7);
        demoMandant.add(demo6);
        demoMandant.add(demo5);
        demoMandant.add(demo4);
        demoMandant.add(demo3);
        demoMandant.add(demo2);
        demoMandant.add(demo1);
        demoMandant.add(freiItem);

        popup.addSeparator();

        //Item Login-Wechsel + Beenden dem Menü zufügen.
        popup.add(loginwechsel);             //Login-Wechsel
        popup.addSeparator();
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

        //---------------------------------------------------------------------------------------------------------------------------------

        // Verweis auf die Bühne in pwFenster speichern.
        this.pwFenster = primaryStage;

        //Bei Doppelklickt Passwort-Fenster wieder einblenden.
        trayIcon.addActionListener(event -> Platform.runLater(this::PasswortFenster));

        //---------------------------------------------------------------------------------------------------------------------------------

        //Echt-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtEchtMandanten
        EventsEcht evtEchtMandanten = new EventsEcht();

        //ActionListener Objekte den Items zuordnen.
        echt1.addActionListener(evtEchtMandanten);
        echt2.addActionListener(evtEchtMandanten);
        echt3.addActionListener(evtEchtMandanten);
        echt4.addActionListener(evtEchtMandanten);
        echt5.addActionListener(evtEchtMandanten);
        echt6.addActionListener(evtEchtMandanten);
        echt7.addActionListener(evtEchtMandanten);
        echt8.addActionListener(evtEchtMandanten);

        //Test-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtTestMandanten
        EventsTest evtTestMandanten = new EventsTest();

        //ActionListener Objekte den Items zuordnen.
        test1.addActionListener(evtTestMandanten);
        test2.addActionListener(evtTestMandanten);
        test3.addActionListener(evtTestMandanten);
        test4.addActionListener(evtTestMandanten);
        test5.addActionListener(evtTestMandanten);
        test6.addActionListener(evtTestMandanten);
        test7.addActionListener(evtTestMandanten);
        test8.addActionListener(evtTestMandanten);

        //Demo-Mandanten
        //ActionListener Objekt erstellen / Zugriff auf die Klasse EvtDemoMandanten
        EventsDemo evtDemoMandanten = new EventsDemo();

        //ActionListener Objekte den Items zuordnen.
        demo1.addActionListener(evtDemoMandanten);
        demo2.addActionListener(evtDemoMandanten);
        demo3.addActionListener(evtDemoMandanten);
        demo4.addActionListener(evtDemoMandanten);
        demo5.addActionListener(evtDemoMandanten);
        demo6.addActionListener(evtDemoMandanten);
        demo7.addActionListener(evtDemoMandanten);
        demo8.addActionListener(evtDemoMandanten);

        //ActionListener Beenden
        exitItem.addActionListener(evtEchtMandanten);

        //Checkbox-Status auswerten
        //PrimaryController Objekt erstellen / Zugriff auf die Klasse PrimaryController
        PrimaryController primaryController = new PrimaryController();
        loginwechsel.addItemListener(primaryController);
    }

    //-------------------------------------------------------------------------------------------------------------------------------------

    //Passwortfenster zurückholen
    private void PasswortFenster() {

        if (pwFenster != null) {
            pwFenster.show();
            pwFenster.toFront();
        }
    }

    //
    public static void main(String[] args) {
        launch();
    }
}