package de.jdev.mavenprojekt1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Ereignisbehandlungsklasse
class EvtTestMandanten implements ActionListener {

    private String cmd;
    private String mandant;
    private String ddeserver;
    private String path2mandant;
    private String path2rungui;
    private Runtime rs;

    //Instanz vom Hauptprogramm um das Passwort hier einlesen zu können.
    App app = new App();

    //Diese Methode wird bei jedem Event aufgerufen.
    @Override
    public void actionPerformed(ActionEvent event) {

        //Text des Source-Objektes.
        cmd = event.getActionCommand();

        //Bedienung der Echtmandanten.
        switch (cmd) {
            case "Test-Mandant1":
                //Pfad zusammenbauen
                mandant = "firma1";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                //Mandantenstart
                rs = Runtime.getRuntime();
                //Kommando ausführen
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant2":
                mandant = "firma2";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant3":
                mandant = "firma3";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant4":
                mandant = "firma4";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant5":
                mandant = "firma5";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant6":
                mandant = "firma6";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant7":
                mandant = "firma7";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Test-Mandant8":
                mandant = "firma8";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
                try {
                    rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                } catch (IOException ex) {
                    Logger.getLogger(EvtEchtMandanten.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;

        }
    }
}