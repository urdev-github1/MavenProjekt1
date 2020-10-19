package de.jdev.mavenprojekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Ereignisbehandlungsklasse
class EvtEchtMandanten implements ActionListener {

    //lokale Variablen
    String cmd;
    String mandant;
    String ddeserver;
    String path2mandant;
    String path2rungui;
    Runtime rs;

    //Instanz vom Hauptprogramm um das Passwort hier einlesen zu können.
    App app = new App();

    //Diese Methode wird bei jedem Event aufgerufen.
    @Override
    public void actionPerformed(ActionEvent event) {

        //Text des Source-Objektes.
        cmd = event.getActionCommand();

        //Bedienung der Echtmandanten.
        switch (cmd) {
            case "Mandant1":
                //Pfad zusammenbauen
                mandant = "firma1";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                //Mandantenstart
                rs = Runtime.getRuntime();
                //Kommando ausführen
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant2":
                mandant = "firma2";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant3":
                mandant = "firma3";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant4":
                mandant = "firma4";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant5":
                mandant = "firma5";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant6":
                mandant = "firma6";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant7":
                mandant = "firma7";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
            break;
            case "Mandant8":
                mandant = "firma8";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                try {
//                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
//                } catch (IOException ex) {
//                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
//                }
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
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
