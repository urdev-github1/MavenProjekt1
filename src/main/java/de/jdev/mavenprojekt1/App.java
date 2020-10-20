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

    //
    String firma1 = "firma1";
    String firma2 = "firma2";
    String firma3 = "firma3";
    String firma4 = "firma4";
    String firma5 = "firma5";
    String firma6 = "firma6";
    String firma7 = "firma7";
    String firma8 = "firma8";

    //lokale Variablen
    Stage pwFenster;        //Passwortfenster

    //Echt-Mandanten
    MenuItem mandant1;
    MenuItem mandant2;
    MenuItem mandant3;
    MenuItem mandant4;
    MenuItem mandant5;
    MenuItem mandant6;
    MenuItem mandant7;
    MenuItem mandant8;

    //Unterverzeichnis für die Test-Mandanten
    Menu testMandant;

    //Test-Mandanten
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

    //Demo-Mandanten
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

    // + Popup-Menü
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

        //Unterverzeichnis für die Test-Mandanten
        testMandant = new Menu("Test-Mandanten");

        //Items im Verzeichnis 'Test-Mandanten' erzeugen.
        test1 = new MenuItem("Test-Mandant1");
        test2 = new MenuItem("Test-Mandant2");
        test3 = new MenuItem("Test-Mandant3");
        test4 = new MenuItem("Test-Mandant4");
        test5 = new MenuItem("Test-Mandant5");
        test6 = new MenuItem("Test-Mandant6");
        test7 = new MenuItem("Test-Mandant7");
        test8 = new MenuItem("Test-Mandant8");

        //Unterverzeichnis für die Demo-Mandanten
        demoMandant = new Menu("Demo-Mandanten");

        //Items im Verzeichnis 'Demo-Mandanten' erzeugen.
        demo1 = new MenuItem("Demo-Mandant1");
        demo2 = new MenuItem("Demo-Mandant2");
        demo3 = new MenuItem("Demo-Mandant3");
        demo4 = new MenuItem("Demo-Mandant4");
        demo5 = new MenuItem("Demo-Mandant5");
        demo6 = new MenuItem("Demo-Mandant6");
        demo7 = new MenuItem("Demo-Mandant7");
        demo8 = new MenuItem("Demo-Mandant8");
        //Demomandanten freischalten
        freiItem = new MenuItem("* Freischalten *");

        //Items Loginwechsel + Beenden
        loginwechsel = new CheckboxMenuItem("Login-Wechsel",false);
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

        // Verweis auf die Bühne in pwFenster speichern.
        this.pwFenster = primaryStage;

        //Bei Doppelklickt Passwort-Fenster wieder einblenden.
        trayIcon.addActionListener(event -> Platform.runLater(this::PasswortFenster));

//        //Exit-Event (Programm beenden).
//        exitItem.addActionListener(event -> System.exit(0));


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
        EvtDemoMandanten evtDemoMandanten = new EvtDemoMandanten();

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





//        ActionListener al = new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                String cmd = event.getActionCommand();
//                JOptionPane.showMessageDialog(null, cmd);
//            }
//        };

//        //Passwortbox 1 bzw. 2 aktivieren
//        loginwechsel.addItemListener(new ItemListener() {
//
//            @Override
//            public void itemStateChanged(ItemEvent ie) {
//                JOptionPane.showMessageDialog(null, "Login-Wechsel");
////                if (pass1.isVisible()) {
////                    pass2.setVisible(true);
////                    generator.setVisible(true);  //Button
////                    pass1.setVisible(false);
////                } else {
////                    pass2.setVisible(false);
////                    generator.setVisible(false);
////                    pass1.setVisible(true);
////                }
//            }
//        });


    }

//     ---------------------------------------------------------------------------------------------------------------------------------

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