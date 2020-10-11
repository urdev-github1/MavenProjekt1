package de.jdev.mavenprojekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Ereignisbehandlungsklasse
class EvtEchtMandanten implements ActionListener {

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
            case "Mandant1":
                //Pfad zusammenbauen
                mandant = "firma1";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                //Mandantenstart
                Runtime rs = Runtime.getRuntime();
//                rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Mandant2":
                mandant = "firma2";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";
                rs = Runtime.getRuntime();
//                rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                break;
            case "Mandant3":
                mandant = "firma3";
                ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
                path2mandant = "\\\\abas-fs1\\erp" + mandant;
                path2rungui = path2mandant + "\\rungui.exe";

                rs = Runtime.getRuntime();
//                rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
                JOptionPane.showMessageDialog(null, "" + path2rungui + " * " + ddeserver + " " + path2mandant + " " + app.primaryController.getPassw());
        }
    }
}
