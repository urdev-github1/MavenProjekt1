package de.jdev.mavenprojekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Ereignisbehandlungsklasse
class EvtEchtMandanten implements ActionListener {

    //Diese Methode wird bei jedem Event aufgerufen.
    @Override
    public void actionPerformed(ActionEvent event) {

        //lokale Variablen
        String mandant;
        String mandant1;
        String mandant2;
        String mandant3;
        String mandant4;
        String mandant5;
        String mandant6;
        String mandant7;
        String mandant8;

        String cmd;
        String ddeserver;
        String path2mandant;
        String path2rungui;
        String passwort;
        Runtime rs;

        //Instanz vom Hauptprogramm um das Passwort hier einlesen zu können.
        App app = new App();
        passwort = app.primaryController.getPassw();

        //
        mandant1 = app.firma1;
        mandant2 = app.firma2;
        mandant3 = app.firma3;
        mandant4 = app.firma4;
        mandant5 = app.firma5;
        mandant6 = app.firma6;
        mandant7 = app.firma7;
        mandant8 = app.firma8;

        //Text des Source-Objektes.
        cmd = event.getActionCommand();

        //Bedienung der Echtmandanten.
        switch (cmd) {
            case "Mandant1":
                //Pfad zusammenbauen
                mandant = mandant1;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                //Mandantenstart
                rs = Runtime.getRuntime();
                //Kommando ausführen
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant2":
                mandant = mandant2;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant3":
                mandant = mandant3;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant4":
                mandant = mandant4;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant5":
                mandant = mandant5;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant6":
                mandant = mandant6;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant7":
                mandant = mandant7;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
            case "Mandant8":
                mandant = mandant8;
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + passwort);
            break;
//            case "Login-Wechsel":
//                JOptionPane.showMessageDialog(null, "Login-Wechsel");
//            break;
            case "Beenden":
                System.exit(0);
            break;
        }
    }
}
