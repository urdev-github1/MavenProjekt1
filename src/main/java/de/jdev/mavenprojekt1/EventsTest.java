package de.jdev.mavenprojekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Ereignisbehandlungsklasse
class EventsTest implements ActionListener {

    //Diese Methode wird bei jedem Event aufgerufen.
    @Override
    public void actionPerformed(ActionEvent event) {

        //Buttontexte Testmandanten
        final String button1 = "testfirma1";
        final String button2 = "testfirma2";
        final String button3 = "testfirma3";
        final String button4 = "testfirma4";
        final String button5 = "testfirma5";
        final String button6 = "testfirma6";
        final String button7 = "testfirma7";
        final String button8 = "testfirma8";

        String cmd;

        //Instanz vom Hauptprogramm um das Passwort hier einlesen zu können.
        App app = new App();

        //Text des Source-Objektes (bedienter Button).
        cmd = event.getActionCommand();

        //Bedienung der Echtmandanten.
        switch (cmd) {
            case button1:
                //Mandant starten
                Ausfuehren(app.firma1);
                break;
            case button2:
                Ausfuehren(app.firma2);
                break;
            case button3:
                Ausfuehren(app.firma3);
                break;
            case button4:
                Ausfuehren(app.firma4);
                break;
            case button5:
                Ausfuehren(app.firma5);
                break;
            case button6:
                Ausfuehren(app.firma6);
                break;
            case button7:
                Ausfuehren(app.firma7);
                break;
            case button8:
                Ausfuehren(app.firma8);
                break;
            case "Beenden":
                System.exit(0);
                break;
        }
    }

    //
    private void Ausfuehren(String mandant) {
        String ddeserver;
        String path2mandant;
        String path2rungui;
        String passwort;
        Boolean testmodus;
        Runtime rs;

        //Instanz vom Hauptprogramm um das Passwort hier einlesen zu können.
        App app = new App();
        passwort = app.primaryController.getPassw();
        testmodus = app.testmodus;

        //Pfad zusammenbauen
        ddeserver = "abas-EKS_Testmandant" + " " + mandant;
        path2mandant = "\\\\abas-fs1\\test" + mandant;
        path2rungui = path2mandant + "\\rungui.exe";

        //Mandantenstart
        rs = Runtime.getRuntime();

        //Kommando ausführen
        if (!testmodus) {
            try {
                rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            } catch (IOException ex) {
                Logger.getLogger(EventsEcht.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //Testmodus
            JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
        }
    }
}